package com.regularExpression;

import java.util.regex.Pattern;

public class Split {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\.");
		String[] str=p.split("pankaj.sir.academy.psa");
		System.out.println(str.length);
		/*
		 * for (String string : str) { System.out.println(string); }
		 */
	}

}
