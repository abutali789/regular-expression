package com.regularExpression;

public class C {
	public static void main(String[] args) {
		String str="7275153464";
		String str1="(0/91)?[6-9][0-9]{9}";
		
		//Pattern p=Pattern.compile(str);
		System.out.println("given mobile no is valid: "+str.matches(str1));
	}

}
