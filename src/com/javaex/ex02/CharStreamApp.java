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
			str = br.readLine();  //���پ� �о�´� --> �ٹٲޱ�ȣ ����
			if(str==null) {
				break;
			}
				
				
			System.out.println(str);
			
		}
		
		fr.close();
		
		
		
		
		/*Writer fw =new FileWriter("D:\\javaStudy\\file\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("�б����� ������");
		bw.newLine();
		bw.write("�������");
		bw.newLine();                     //bw.newLine(); �ٹٲ�!!
		bw.write("�������� �츮��");
		bw.newLine();
		bw.write("��ٸ��Ŵ�");
		
		bw.close();*/

	}

}