package com.example;

/**
 * �� ���� ������ �����ϰ� ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class RelationalOperator2 {

	/**
	 * �� ������ �����ϰ� ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] ���ڿ��� == �����ڷ� ���� ���
		boolean result = "�����ٶ�" == "�����ٶ�";
		System.out.println( "[1] \"�����ٶ�\" == \"�����ٶ�\" -> result = " + result );
		
		// [2] String�� �����ڷ� ���� �ν��Ͻ��� == �����ڷ� ���� ���
		result = new String( "�����ٶ�" ) == new String( "�����ٶ�" );
		System.out.println( "[2] new String(\"�����ٶ�\") == new String(\"�����ٶ�\") -> result = " + result );
		
	}

}
