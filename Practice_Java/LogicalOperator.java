package com.example;

/**
 * �� ���� ������ ������ ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class LogicalOperator {

	/**
	 * �� ������ ������ ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] &&( AND ) ������
		boolean result = true && true;
		System.out.println( "[1] true && true -> result = " + result );
		
		result = true && false;
		System.out.println( "[1] true && false -> result = " + result );

		result = false && false;
		System.out.println( "[1] false && false -> result = " + result );

		// [2] ||( OR ) ������
		result = true || true;
		System.out.println( "[2] true || true -> result = " + result );
		
		result = true || false;
		System.out.println( "[2] true || false -> result = " + result );

		result = false || false;
		System.out.println( "[2] false || false -> result = " + result );
		
		// [3] !( NOT ) ������
		result = !true;
		System.out.println( "[3] !true -> result = " + result );
		
		result = !false;
		System.out.println( "[3] !false -> result = " + result );
		
	}

}
