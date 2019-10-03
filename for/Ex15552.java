package com.test.level3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Ex15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			String s = br.readLine();
			String[] num = s.split(" ");
			
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			
			bw.write((a + b) + "\n");
		}
		bw.flush();
		bw.close();
	}
}
