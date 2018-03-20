package com.javaex.ex04;

import java.awt.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class PersonApp {

	public static void main(String[] args) throws IOException {
		
		ArrayList<Person> list = new ArrayList<Person>();
		
		Reader fr = new FileReader("D:\\javaStudy\\file\\phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line = "";
		
		while(true) {
			line = br.readLine();
			if(line == null) {
				break;
			}
			String[] personInfo = line.split(","); 
			
			Person person = new Person(personInfo[0], personInfo[1], personInfo[2]);
			list.add(person);
		
		}
		
		for(Person p : list) {
			System.out.println("이름: " + p.getName());
			System.out.println("핸드폰: " + p.getHp());
			System.out.println("회사번호: " + p.getCompany());
			System.out.println("");			
		}
		
	}

}
