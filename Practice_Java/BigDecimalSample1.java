package com.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal ������ �����ϰ� ������ Ȯ���ϴ� Ŭ����
 */
public class BigDecimalSample1 {

	/**
	 * BigDecimal���� ����� �����ϰ� ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] ���ϱ�
		BigDecimal value1 = new BigDecimal( "0.7" );
		BigDecimal value2 = new BigDecimal( "0.1" );
		BigDecimal result = value1.add( value2 );
		System.out.println( "[1] 0.7 + 0.1 = " + result );
		
		// [2] ����
		result = value1.subtract( value2 );
		System.out.println( "[2] 0.7 - 0.1 = " + result );
		
		// [3] ���ϱ�
		result = value1.multiply( value2 );
		System.out.println( "[3] 0.7 * 0.1 = " + result );
		
		// [4] ������
		value1 = new BigDecimal( "7.0" );
		value2 = new BigDecimal( "3.0" );
		result = value1.divide( value2, 0, RoundingMode.DOWN );		// �Ҽ��� �̸��� ����
		System.out.println( "[4] 7.0 / 3.0 = " + result );

		// [5] ������
		value1 = new BigDecimal( "7.0" );
		value2 = new BigDecimal( "3.0" );
		result = value1.remainder( value2 );
		System.out.println( "[5] 7.0 % 3.0 = " + result );
		
	}

}
