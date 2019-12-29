package com.example;

/**
 * if 문 예제를 실행하고 내용을 확인하는 클래스입니다.
 */
public class IfStatement {

	/**
	 * if 문을 실행해 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인수의 문자열을 int값으로 변환
		int value = Integer.valueOf( args[ 0 ] );
		
		// [1] if문
		if ( value == 0 ) {
			System.out.println( "[1] value는 0" );
		} else if ( value == 1 ) {
			System.out.println( "[1] value는 1" );
		} else {
			System.out.println( "[1] value는 0도 1도 아니다" );
		}
	}

}
