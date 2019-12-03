package com.regularExpression;

import java.util.StringTokenizer;

public class Tokenizer {
	public static void main(String[] args) {
		StringTokenizer str=new StringTokenizer("29-05-2019", "-");
		while (str.hasMoreTokens()) {
			System.out.println(str.nextToken());
			
		}
	}

}
