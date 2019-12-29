package com.example;

/**
 * 산술 연산자를 확인하는 클래스
 */
public class ArithmeticOperator2 {

	/**
	 * 산술 연산자를 실행해 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] 괄호 없음
		System.out.println( "[1] 1 + 1 = " + 1 + 1 );
		
		// [2] 괄호 있음
		System.out.println( "[2] 1 + 1 = " + ( 1 + 1 ) );
		
		// [3] 수치가 왼쪽에 있을 때
		System.out.println( 1 + 2 + "3" );
	}

}
