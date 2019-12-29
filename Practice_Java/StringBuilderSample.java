package com.example;

public class StringBuilderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "정말";
		String text2 = "감사합니다.";
		StringBuilder sb = new StringBuilder();
		sb.append( text1 );
		sb.append( text2 );
		String resultString = sb.toString();
		
		System.out.println( resultString );
	}

}
