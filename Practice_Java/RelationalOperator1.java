package com.example;

/**
 * �� ���� ������ �����ϰ� ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class RelationalOperator1 {

	/**
	 * �� ������ �����ϰ� ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] ������ �����͸� �����ڷ� ���� ���
		boolean result = new Integer( "1" ) == new Integer( "1" );
		System.out.println( "[1] new Integer(\"1\") == new Integer(\"1\") -> result = " + result );
		
		// [2] ������ �����͸� equals �޼���� ���� ���
		result = new Integer( "1" ).equals( new Integer( "1" ) );
		System.out.println( "[2] new Integer(\"1\").equals( new Integer(\"1\") ) -> result = " + result );
		
		// [3] ������ �����͸� compareTo �޼���� ���� ���
		int resultValue = new Integer( "1" ).compareTo( new Integer( "1" ) );
		System.out.println( "[3] new Integer(\"1\").compareTo( new Integer(\"1\") ) -> resultValue = " + resultValue );
	
		resultValue = new Integer( "1" ).compareTo( new Integer( "2" ) );
		System.out.println( "[3] new Integer(\"1\").compareTo( new Integer(\"2\") ) -> resultValue = " + resultValue );
		
		resultValue = new Integer( "2" ).compareTo( new Integer( "1" ) );
		System.out.println( "[3] new Integer(\"2\").compareTo( new Integer(\"1\") ) -> resultValue = " + resultValue );
		
	}

}
