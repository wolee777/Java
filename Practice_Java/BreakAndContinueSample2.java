package com.example;

/**
 * break ���� continue �� ������ �����ϰ� ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class BreakAndContinueSample2 {

	/**
	 * break ���� continue ���� �����ϰ� ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "------- [1] ������ ��ø�� ��� ���� �������� break -------" );
		for ( int i = 0; i < 3; ++i ) {
			for ( int j = 0; j < 3; ++j ) {
				if ( j == 1 ) {
					System.out.println( "j == 1�� �� break" );
					break;
				}
				System.out.println( "i = " + i + ", j = " + j );
			}
		}
		
		System.out.println( "------- [2] ������ ��ø�� ��� ���� �������� continue -------" );
		for ( int i = 0; i < 3; ++i ) {
			for ( int j = 0; j < 3; ++j ) {
				if ( j == 1 ) {
					System.out.println( "j == 1�� �� continue" );
					continue;
				}
				System.out.println( "i = " + i + ", j = " + j );
			}
		}

		System.out.println( "------- [3] ������ ��ø�� ��� �ٱ��� �������� break -------" );
		for ( int i = 0; i < 3; ++i ) {
			if ( i == 1 ) {
				System.out.println( "i == 1�� �� break" );
				break;
			}
			for ( int j = 0; j < 3; ++j ) {
				System.out.println( "i = " + i + ", j = " + j );
			}
		}

		System.out.println( "------- [4] ������ ��ø�� ��� �ٱ��� �������� continue -------" );
		for ( int i = 0; i < 3; ++i ) {
			if ( i == 1 ) {
				System.out.println( "i == 1�� �� continue" );
				continue;
			}
			for ( int j = 0; j < 3; ++j ) {
				System.out.println( "i = " + i + ", j = " + j );
			}
		}
		
	}


}
