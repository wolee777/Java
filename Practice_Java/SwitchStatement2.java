package com.example;

/**
 * switch �� ������ �����ϰ� ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class SwitchStatement2 {

	/**
	 * switch ���� �����ϰ� ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �μ��� ���ڿ��� int������ ��ȯ
		int value = Integer.valueOf( args[ 0 ] );
		
		// [1] switch ��
		switch( value ) {
		case 0:
			System.out.println( "[1] value�� 0" );
			
		case 1:
			System.out.println( "[1] value�� 1" );
			
		default:
			System.out.println( "[1] value�� 0�� 1�� �ƴϴ�." );
		}
	}

}
