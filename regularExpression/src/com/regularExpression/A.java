package com.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A {
	public static void main(String[] args) {
		String x="[^abc]";
		Pattern p=Pattern.compile(x);
		Matcher m=p.matcher("a7b@ccdzefg#a");
		while (m.find()) {
			System.out.println(m.start()+"____"+m.group());
			
		}
	}

}
