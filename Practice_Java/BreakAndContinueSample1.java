package com.example;

/**
 * break ���� continue �� ������ �����ϰ� ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class BreakAndContinueSample1 {

	/**
	 * break ���� continue ���� �����ϰ� ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� i�� 1�� ��� ���� ����
		System.out.println( "------- [1] break -------" );
		for ( int i = 0; i < 3; ++i ) {
			if ( i == 1 ) {
				break;
			}
			System.out.println( "i = " + i );
		}
		
		// ���� i�� 1�� ��� ���� ������ ��ŵ
		System.out.println( "------- [2] continue -------" );
		for ( int i = 0; i < 3; ++i ) {
			if ( i == 1 ) {
				continue;
			}
			System.out.println( "i = " + i );
		}
		
	}

}
