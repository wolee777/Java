package com.example;

/**
 * ��� �����ڸ� Ȯ���ϴ� Ŭ����
 */
public class ArithmeticOperator1 {
	
	/**
	 * ��� �����ڸ� ������ ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] Ư���� ��� 
		int result = 1;
		result += 2;
		System.out.println( "[1] result -> result += 2 -> result = " + result );
		
		// [2] Ư���� ���
		System.out.println( "[2] result = 1 -> ++result " );
		result = 1;
		printValue( ++result );
		System.out.println( "result = " + result );
		
		// [3] Ư���� ���
		System.out.println( "[3] result = 1 -> result++" );
		result = 1;
		printValue( result++ );
		System.out.println( "result = " + result );
	}
	
	/**
	 * ���޵� �� value�� ȭ�鿡 ����մϴ�.
	 * 
	 * @param value
	 * 			��
	 */
	private static void printValue( int value ) {
		System.out.println( "���޵� �� : value = " + value );
	}

}
