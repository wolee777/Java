package com.example;

/**
 * 자바 8에서 부호 없는 Integer와 Long의 한계치일 때의 동작을 확인하는 클래스
 */
public class OverflowCheck2 {

	/**
	 * 자바 8에서 부호 없는 Integer와 Long의 한계치 예제를 출력합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자바 8부터
		int i = Integer.MAX_VALUE + 1;
		String value = Integer.toUnsignedString( i );
		System.out.println( value );
		
		i = Integer.MAX_VALUE + Integer.MAX_VALUE + 1;
		value = Integer.toUnsignedString( i );
		System.out.println( value );
		
		i = i + 1;
		value = Integer.toUnsignedString( i );
		System.out.println( value );
		
		long l = Long.MAX_VALUE + Long.MAX_VALUE + 1;
		value = Long.toUnsignedString( l );
		System.out.println( value );
		
		l = l + 1;
		value = Long.toUnsignedString( l );
		System.out.println( value );
	}

}
