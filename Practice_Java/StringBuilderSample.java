package com.example;

public class StringBuilderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "����";
		String text2 = "�����մϴ�.";
		StringBuilder sb = new StringBuilder();
		sb.append( text1 );
		sb.append( text2 );
		String resultString = sb.toString();
		
		System.out.println( resultString );
	}

}
