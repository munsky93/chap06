package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp {

	public static void main(String[] args) throws IOException {


		Reader fr = new FileReader("D:\\javaStudy\\file\\MS949.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str = "";
		while(true) {
			str = br.readLine();  //한줄씩 읽어온다 --> 줄바꿈기호 제외
			if(str==null) {
				break;
			}
				
				
			System.out.println(str);
			
		}
		
		fr.close();
		
		
		
		
		/*Writer fw =new FileWriter("D:\\javaStudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 땡땡땡");
		bw.newLine();
		bw.write("어서모이자");
		bw.newLine();                     //bw.newLine(); 줄바꿈!!
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		bw.close();*/

	}

}