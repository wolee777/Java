package com.example;

/**
 * break ���� continue �� ������ �����ϰ� ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class BreakAndContinueSample3 {

	/**
	 * break ���� continue ���� �����ϰ� ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "------- [1] ���̺��� ������ �������� break -------" );
		label: for ( int i = 0; i < 3; ++i ) {
			for ( int j = 0; j < 3; ++j ) {
				if ( j == 1 ) {
					System.out.println( "j == 1�� �� label�� ���� break" );
					break label;
				}
				System.out.println( "i = " + i + ", j = " + j );
			}
		}
		
		System.out.println( "------- [2] ���̺��� ������ �������� continue -------" );
		label: for ( int i = 0; i < 3; ++i ) {
			for ( int j = 0; j < 3; ++j ) {
				if ( j == 1 ) {
					System.out.println( "j == 1�� �� label�� ���� continue" );
					continue label;
				}
				System.out.println( "i = " + i + ", j = " + j );
			}
		}
	}

}
