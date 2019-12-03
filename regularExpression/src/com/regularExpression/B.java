package com.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class B {
	public static void main(String[] args) {
		//String x="[0-9]";
		//String x="[^a-zA-Z0-9]";
		//String x="[a-zA-Z0-9]";
		//String x="[0-9]";
		//String x="[^0-9]";
		//String x="[a-z]";
		//String x="[^a-z]";
		//String x="\\S";//for not space
		//String x="\\s";// for space
		//String x="\\d";// for digit
		//String x="\\D";// insted of digit
		//String x="\\w"; //other than special character
		//String x="\\W"; //only for special character
		//String x="."; //for any character,letter,any no
		String x="a*";
		
		Pattern p=Pattern.compile(x);
		Matcher m=p.matcher("aaaa7b@cc.  <>AB`LK'+_) /(*aaaa&^%$#@1aaaa5!~dze8f96g#a");
		while(m.find()) {
			System.out.println(m.start()+"_____"+m.group());
			
		}
	}

}
