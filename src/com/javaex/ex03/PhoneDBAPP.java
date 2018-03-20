package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class PhoneDBAPP {

	public static void main(String[] args) throws IOException {


		Reader i = new FileReader("D:\\javaStudy\\file\\phoneDB.txt");
		BufferedReader j = new BufferedReader(i);
		String str = "";
		
		while(true ) {
			str = j.readLine();
			/*System.out.println(str);*/
			
			if(str == null) {
				break;
			}
			
			String[] personInfo = str.split(",");             //persomInfo이름 막지은거
			
			String name = personInfo[0];
			String hp =  personInfo[1];
			String company =  personInfo[2];
			
			System.out.println("이름: " + name);
			System.out.println("핸드폰: " + hp);
			System.out.println("회사: " + company);
			System.out.println("");
		}
		
		}

}
