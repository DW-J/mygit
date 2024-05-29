package com.dawoon.may272.main;

import java.io.InputStream;

import com.dawoon.http.client.DawoonHttpClient;

public class HMain3 {
	public static void main(String[] args) {
		try {
			InputStream is = DawoonHttpClient.download("https://www.naver.com");
			String result = DawoonHttpClient.convert(is, "UTF-8");
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}









