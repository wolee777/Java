package com.example;

/**
 * �ڹ� 8���� ��ȣ ���� Integer�� Long�� �Ѱ�ġ�� ���� ������ Ȯ���ϴ� Ŭ����
 */
public class OverflowCheck2 {

	/**
	 * �ڹ� 8���� ��ȣ ���� Integer�� Long�� �Ѱ�ġ ������ ����մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ڹ� 8����
		int i = Integer.MAX_VALUE + 1;
		String value = Integer.toUnsignedString( i );
		System.out.println( value );
		
		i = Integer.MAX_VALUE + Integer.MAX_VALUE + 1;
		value = Integer.toUnsignedString( i );
		System.out.println( value );
		
		i = i + 1;
		value = Integer.toUnsignedString( i );
		System.out.println( value );
		
		long l = Long.MAX_VALUE + Long.MAX_VALUE + 1;
		value = Long.toUnsignedString( l );
		System.out.println( value );
		
		l = l + 1;
		value = Long.toUnsignedString( l );
		System.out.println( value );
	}

}
