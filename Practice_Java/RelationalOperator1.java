package com.example;

/**
 * 비교 연산 예제를 실행하고 내용을 확인하는 클래스입니다.
 */
public class RelationalOperator1 {

	/**
	 * 비교 연산을 실행하고 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] 참조형 데이터를 연산자로 비교한 경우
		boolean result = new Integer( "1" ) == new Integer( "1" );
		System.out.println( "[1] new Integer(\"1\") == new Integer(\"1\") -> result = " + result );
		
		// [2] 참조형 데이터를 equals 메서드로 비교한 경우
		result = new Integer( "1" ).equals( new Integer( "1" ) );
		System.out.println( "[2] new Integer(\"1\").equals( new Integer(\"1\") ) -> result = " + result );
		
		// [3] 참조형 데이터를 compareTo 메서드로 비교한 경우
		int resultValue = new Integer( "1" ).compareTo( new Integer( "1" ) );
		System.out.println( "[3] new Integer(\"1\").compareTo( new Integer(\"1\") ) -> resultValue = " + resultValue );
	
		resultValue = new Integer( "1" ).compareTo( new Integer( "2" ) );
		System.out.println( "[3] new Integer(\"1\").compareTo( new Integer(\"2\") ) -> resultValue = " + resultValue );
		
		resultValue = new Integer( "2" ).compareTo( new Integer( "1" ) );
		System.out.println( "[3] new Integer(\"2\").compareTo( new Integer(\"1\") ) -> resultValue = " + resultValue );
		
	}

}
