package com.example;

/**
 * int�� �ִ��� ���� ���� ������ Ȯ���ϴ� Ŭ����
 */
public class OverflowCheck1 {

	/**
	 * �ִ񰪿� 1�� ���� ���� ����մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.MAX_VALUE;
		System.out.println( i );
		i = i + 1;
		System.out.println( i );
	}

}
