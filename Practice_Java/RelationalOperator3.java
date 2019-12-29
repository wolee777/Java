package com.example;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 비교 연산 예제를 실행하고 내용을 확인하는 클래스입니다.
 */
public class RelationalOperator3 {

	/**
	 * 비교 연산을 실행하고 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] 자료형 비교
		String value = "가나다라마";
		boolean result = value instanceof String;
		System.out.println( "[1] \"가나다라마\" instanceof String -> result : " + result );
		
		// [2] 상속한 클래스와 자료형 비교
		result = value instanceof Object;
		System.out.println( "[2] \"가나다라마\" instanceof Object -> result : " + result );
		
		// [3] 인터페이스와 자료형 비교
		result = value instanceof Serializable;
		System.out.println( "[3] \"가나다라마\" instanceof Serializable -> result : " + result );
		
		// [4] 일치하지 않는 자료형과 비교
		Object object = "가나다라마";
		result = object instanceof BigDecimal;
		System.out.println( "[4] \"가나다라마\" instanceof BigDecimal -> result : " + result );
		
	}

}
