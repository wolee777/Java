package com.example;

/**
 * switch 문 예제를 실행하고 내용을 확인하는 클래스입니다.
 */
public class SwitchStatement2 {

	/**
	 * switch 문을 실행하고 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 인수의 문자열을 int값으로 변환
		int value = Integer.valueOf( args[ 0 ] );
		
		// [1] switch 문
		switch( value ) {
		case 0:
			System.out.println( "[1] value는 0" );
			
		case 1:
			System.out.println( "[1] value는 1" );
			
		default:
			System.out.println( "[1] value는 0도 1도 아니다." );
		}
	}

}
