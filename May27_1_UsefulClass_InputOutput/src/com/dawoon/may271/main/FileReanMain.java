package com.dawoon.may271.main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReanMain {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {
			
			
			FileReader fr = new FileReader("C:\\Users\\cloud\\OneDrive\\바탕 화면\\Test/dawoon1.txt");
			br = new BufferedReader(fr);
			
			String line = null;
			while ( ( line = br.readLine() ) != null ) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}











