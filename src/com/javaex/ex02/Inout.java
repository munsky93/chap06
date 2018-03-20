package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Inout {

	public static void main(String[] args) throws IOException {      
	
		
		Reader isr = new InputStreamReader(System.in);      //System.out (총)
		BufferedReader br = new BufferedReader(isr);        //isr (소음기)
		String line = br.readLine();
        
		Writer osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write(line);
		
	    br.close();
	    bw.close();
	    
	}

}
