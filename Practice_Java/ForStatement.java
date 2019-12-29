package com.example;

/**
 * for 문 예제를 실행하고 내용을 확인하는 클래스입니다.
 */
public class ForStatement {

	/**
	 * for 문을 실행하고 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] for 문
		System.out.println( "------- 카운터를 이용한 예제 -------" );
		String stringValue = "가나다라마";
		for ( int i = 0; i < stringValue.length(); ++i ) {
			System.out.println( "[1] " + stringValue.charAt( i ) );
		}
		
		System.out.println( "------- 배열을 이용한 예제 -------" );
		char[] chars = stringValue.toCharArray();
		for ( char charValue : chars ) {
			System.out.println( "[2] " + charValue );
		}
		
	}

}
