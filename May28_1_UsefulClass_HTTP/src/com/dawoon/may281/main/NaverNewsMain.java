package com.dawoon.may281.main;

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.dawoon.http.client.DawoonHttpClient;

// Client ID : WlrEUysFgKnIyS0MxN3j 
// Client Secret : TvVA6ptMtb	

// https://openapi.naver.com/v1/search/news.xml	

// https://search.naver.com/search.naver?sm=tab_hty.top&where=news&ssc=tab.news.all
// &query=%ED%94%84%EB%9E%91%EC%8A%A4+%EC%98%A4%ED%94%88
// &oquery=%EB%9D%BC%ED%8C%8C%EC%97%98+%EB%82%98%EB%8B%AC
// &tqi=iDS5lwqo1LVssaFR5WCssssstFl-243181

// 인터넷 주소 체계
//	프로토콜:// - 통신방식
//		컴퓨터의 주소/
//		폴더명/폴더명/.../파일명
//		? 다음에 나오는 
//			변수명=값&변수명=값&변수명=값...
//			=> 요청 파라미터 : 클라이언트가 서버에게 공개적으로 전달할 정보

// 주소에 한글, 특수문자가 바로 들어가면 안됨
//		ex) ㅋ => %2D (URL Encoding)

// 검색어 하나를 콘솔에 입력
//		=> 나오는 결과를 하나의 String 변수에 담아서 출력

public class NaverNewsMain {
	public static void main(String[] args) {
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("검색어 : ");
			String search = k.next();
			System.out.println(search);
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);
			
			String address = "https://openapi.naver.com/v1/search/news.xml";
			address += "?query=" + search;
			
			// HttpsURLConnection 활용 => 안에 있는 기능...
			
			URL u = new URL(address);
			HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
			
//			// 요청 헤더 : 요청하기 전에 내부적으로 데이터를 전송
//			huc.addRequestProperty("X-Naver-Client-Id", "WlrEUysFgKnIyS0MxN3j");
//			huc.addRequestProperty("X-Naver-Client-Secret", "TvVA6ptMtb");
//			
//			InputStream is = huc.getInputStream();
//			String result = DawoonHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
			//////////////////////////////////////////////////////////////////
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("X-Naver-Client-Id", "WlrEUysFgKnIyS0MxN3j");
			headers.put("X-Naver-Client-Secret", "TvVA6ptMtb");
			InputStream is = DawoonHttpClient.download(address, headers);
//			String result = DawoonHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
			
			// 뉴스의 title / description
			// 제목 : Naver Open API - news
			// 내용 : Naver Search Result => 안나오게
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance(); // 1.공장만들고
			XmlPullParser xpp = xppf.newPullParser(); // 2.파싱할 수 있는 객체 만들어주고
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType(); // 3.각 태그의 고유 정수값 입력
			String tagName = null; 
			boolean data = false;
			String t = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if (tagName.equals("item")) {
						data = true;
					}
				} else if (type == XmlPullParser.TEXT) {
					if (data) {
						if (tagName.equals("title")) {
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							t = t.replace("&quot;", "");
							t = t.replace("&apos;", "'");
							t = t.replace("&amp;", "&");
							System.out.printf("제목 : %s\n", xpp.getText());
						} else if (tagName.equals("description")) {
							t = xpp.getText();
							t = t.replace("<b>", "");
							t = t.replace("</b>", "");
							t = t.replace("&quot;", "");
							t = t.replace("&apos;", "");
							t = t.replace("&amp;", "&");
							System.out.printf("내용 : %s\n", xpp.getText());
							System.out.println("====================");
						}
					}
				} else if (type == XmlPullParser.END_TAG) {
					tagName = ""; 
				} 
				xpp.next(); 
				type = xpp.getEventType(); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}













