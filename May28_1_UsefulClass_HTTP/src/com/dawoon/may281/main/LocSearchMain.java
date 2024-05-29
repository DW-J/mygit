package com.dawoon.may281.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.dawoon.http.client.DawoonHttpClient;

// https://dapi.kakao.com/v2/local/search/keyword.${FORMAT} -> json방시
// abf07c1bc7cc9d38d6e1bc90881fc5e5
// 37.4879496 / 127.0565941 ( y / x )
public class LocSearchMain {
	public static void main(String[] args) {
		// 기준점 주변 반경 5km이내에 검색한 키워드(입력)가 포함된 가게들을
		// 거리 기중으로 정렬
		
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("검색 : ");
			String search = k.next();
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);
			
			String address = "https://dapi.kakao.com/v2/local/search/keyword.json";
			address += "?query=" + search; // 검색어
			address += "&x=127.066496&y=37.489182";
			address += "&radius=5000";
			address += "&sort=distance";
					
			// Authorization: KakaoAK abf07c1bc7cc9d38d6e1bc90881fc5e5
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization", "KakaoAK abf07c1bc7cc9d38d6e1bc90881fc5e5");
					
			InputStream is = DawoonHttpClient.download(address, headers);
			String str = DawoonHttpClient.convert(is, "UTF-8");
			System.out.println(str);
			
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject) jp.parse(str);
			
			// 총 검색 결과 수
			JSONObject meta = (JSONObject) jo.get("meta");
			System.out.printf("총 검색 결과 수 : %d개\n", meta.get("total_count"));
			
			// 현재페이지 결과 수
			System.out.printf("현재페이지 결과 수 : %d개\n", meta.get("pageable_count"));
			
			JSONArray ja = (JSONArray) jo.get("documents");
			JSONObject data = null;
			for (int i = 0; i < ja.size(); i++) {
				data = (JSONObject) ja.get(i);
				// 주소
				System.out.printf("주소 : %s\n", data.get("address_name"));
				// 전화번호
				System.out.printf("전화번호 : %s\n", data.get("phone"));
				// 상호명
				System.out.printf("상호명 : %s\n", data.get("place_name"));
				// 기준점과의 거리
				System.out.printf("거리 : %s\n", data.get("distance"));
				// 를 출력
				System.out.println("=-=-=-=-=-=-=-=-=-");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}














