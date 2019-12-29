package com.example;

/**
 * 문자열 데이터의 참조를 체크합니다.
 */
public class StringCheck1 {

	/**
	 * 두 String 변수에 같은 문자열을 참조하게 하고 같은 곳을 가리키는지 출력합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "가나다라마";
		String b = "가나다라마";
		
		boolean result = ( a == b );
		System.out.println( "a == b : " + result );
	}

}
