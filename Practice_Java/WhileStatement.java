package com.example;

/**
 * while 문 및 do~while 문 예제를 실행하고 내용을 확인하는 클래스입니다.
 */
public class WhileStatement {

	/**
	 * while 문 및 do~while 문을 실행하고 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] while 문
		System.out.println( "------- [1] while 문 -------" );
		int value = 0;
		while ( value < 3 ) {
			System.out.println( "value는 " + value );
			++value;
		}
		
		// [2] do~while 문
		System.out.println( "------- [2] do~while 문 -------" );
		value = 0;
		do {
			System.out.println( "value는 " + value );
			++value;
		} while ( value < 3 );
		
		// [3] 조건이 한 번도 일치하지 않는 while 문
		System.out.println( "------- [3] 조건이 한 번도 일치하지 않는 while 문 -------" );
		value = 0;
		while ( value < 0 ) {
			System.out.println( "value는 " + value );
			++value;
		}
		
		// [4] 조건이 한 번도 일치하지 않는 do~while 문
		System.out.println( "------- [4] 조건이 한 번도 일치하지 않는 do~while 문 -------" );
		value = 0;
		do {
			System.out.println( "value는 " + value );
			++value;
		} while ( value < 0 );
		
	}

}
