package com.javaex.ex01;

import java.io.BufferedInputStream;       //컨트롤 십프트 o
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class ByteBuffStreamApp {

	public static void main(String[] args) throws IOException{


		InputStream in = new FileInputStream("D:\\javaStudy\\file\\img.jpg");
		//in 이름(막지음)  
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("D:\\javaStudy\\file\\ByteBuffer.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		int bData;
		
		System.out.println("복사시작(bufferedstream");
		while(true) {
			bData = bin.read();
			if(bData==-1) {
				System.out.println("복사완료" + bData);
				break;
			}
			bout.write(bData);
		}
		
		bin.close();
		bout.close();
	}

}
