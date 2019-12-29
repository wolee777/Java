package com.example;

/**
 * 논리 연산 예제를 실행해 내용을 확인하는 클래스입니다.
 */
public class LogicalOperator {

	/**
	 * 논리 연산을 실행해 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] &&( AND ) 연산자
		boolean result = true && true;
		System.out.println( "[1] true && true -> result = " + result );
		
		result = true && false;
		System.out.println( "[1] true && false -> result = " + result );

		result = false && false;
		System.out.println( "[1] false && false -> result = " + result );

		// [2] ||( OR ) 연산자
		result = true || true;
		System.out.println( "[2] true || true -> result = " + result );
		
		result = true || false;
		System.out.println( "[2] true || false -> result = " + result );

		result = false || false;
		System.out.println( "[2] false || false -> result = " + result );
		
		// [3] !( NOT ) 연산자
		result = !true;
		System.out.println( "[3] !true -> result = " + result );
		
		result = !false;
		System.out.println( "[3] !false -> result = " + result );
		
	}

}
