package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args)throws IOException{
		
		InputStream in = new FileInputStream("D:\\javaStudy\\file\\img.jpg");
		//in �̸�(������)  
		OutputStream out = new FileOutputStream("D:\\javaStudy\\file\\ByteArray.jpg");
		
	    int bData;
	    byte[] buff = new byte[1024];
	    //buff �̸�(������)
	    
	    System.out.println("�������");
	    while(true) {
	    	bData = in.read(buff);
	    	if(bData==-1) {
	    		System.out.println("���簡 �Ϸ�Ǿ����ϴ�." + bData);
	    		break;
	    	}
	    	 out.write(buff);
	    }
			in.close();
			out.close();
	}

}
