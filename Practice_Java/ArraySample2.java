package com.example;

public class ArraySample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[ 3 ];
		
		// �� ����
		name[ 0 ] = "ö��";
		name[ 1 ] = "����";
		name[ 2 ] = "�浿";
		
		// �� ����
		for ( String value : name ) {
			System.out.println( value );
		}
	}

}
