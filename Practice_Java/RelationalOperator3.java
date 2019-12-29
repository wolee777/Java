package com.example;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * �� ���� ������ �����ϰ� ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class RelationalOperator3 {

	/**
	 * �� ������ �����ϰ� ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] �ڷ��� ��
		String value = "�����ٶ�";
		boolean result = value instanceof String;
		System.out.println( "[1] \"�����ٶ�\" instanceof String -> result : " + result );
		
		// [2] ����� Ŭ������ �ڷ��� ��
		result = value instanceof Object;
		System.out.println( "[2] \"�����ٶ�\" instanceof Object -> result : " + result );
		
		// [3] �������̽��� �ڷ��� ��
		result = value instanceof Serializable;
		System.out.println( "[3] \"�����ٶ�\" instanceof Serializable -> result : " + result );
		
		// [4] ��ġ���� �ʴ� �ڷ����� ��
		Object object = "�����ٶ�";
		result = object instanceof BigDecimal;
		System.out.println( "[4] \"�����ٶ�\" instanceof BigDecimal -> result : " + result );
		
	}

}
