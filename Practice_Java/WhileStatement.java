package com.example;

/**
 * while �� �� do~while �� ������ �����ϰ� ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class WhileStatement {

	/**
	 * while �� �� do~while ���� �����ϰ� ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] while ��
		System.out.println( "------- [1] while �� -------" );
		int value = 0;
		while ( value < 3 ) {
			System.out.println( "value�� " + value );
			++value;
		}
		
		// [2] do~while ��
		System.out.println( "------- [2] do~while �� -------" );
		value = 0;
		do {
			System.out.println( "value�� " + value );
			++value;
		} while ( value < 3 );
		
		// [3] ������ �� ���� ��ġ���� �ʴ� while ��
		System.out.println( "------- [3] ������ �� ���� ��ġ���� �ʴ� while �� -------" );
		value = 0;
		while ( value < 0 ) {
			System.out.println( "value�� " + value );
			++value;
		}
		
		// [4] ������ �� ���� ��ġ���� �ʴ� do~while ��
		System.out.println( "------- [4] ������ �� ���� ��ġ���� �ʴ� do~while �� -------" );
		value = 0;
		do {
			System.out.println( "value�� " + value );
			++value;
		} while ( value < 0 );
		
	}

}
