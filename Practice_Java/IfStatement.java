package com.example;

/**
 * if �� ������ �����ϰ� ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class IfStatement {

	/**
	 * if ���� ������ ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �μ��� ���ڿ��� int������ ��ȯ
		int value = Integer.valueOf( args[ 0 ] );
		
		// [1] if��
		if ( value == 0 ) {
			System.out.println( "[1] value�� 0" );
		} else if ( value == 1 ) {
			System.out.println( "[1] value�� 1" );
		} else {
			System.out.println( "[1] value�� 0�� 1�� �ƴϴ�" );
		}
	}

}
