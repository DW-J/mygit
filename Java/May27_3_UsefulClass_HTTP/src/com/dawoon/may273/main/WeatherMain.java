package com.dawoon.may273.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.dawoon.http.client.DawoonHttpClient;

// http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168067000

// 시간 : hour
// 온도 : temp
// 날씨 : wfKor
// 바람 방향 : wdKor
// 콘솔 출력 

public class WeatherMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			String address = "http://www.kma.go.kr/wid/queryDFSRSS.jsp?zone=1168067000";
			InputStream is = DawoonHttpClient.download(address);
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			
			while (type != XmlPullParser.END_DOCUMENT) {
				if (type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				} else if (type == XmlPullParser.TEXT) {
					if (tagName.equals("hour")) {
						System.out.printf("시간 : %s시, ", xpp.getText());
					} else if (tagName.equals("temp")) {
						System.out.printf("온도 : %s도, ", xpp.getText());
					} else if (tagName.equals("wfKor")) {
						System.out.printf("날씨 : %s, ", xpp.getText());
					} else if (tagName.equals("wdKor")) {
						System.out.printf("풍향 : %s\n", xpp.getText());
						System.out.println("===============================================");
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
