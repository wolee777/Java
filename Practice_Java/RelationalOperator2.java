package com.example;

/**
 * 비교 연산 예제를 실행하고 내용을 확인하는 클래스입니다.
 */
public class RelationalOperator2 {

	/**
	 * 비교 연산을 실행하고 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] 문자열을 == 연사자로 비교한 경우
		boolean result = "가나다라마" == "가나다라마";
		System.out.println( "[1] \"가나다라마\" == \"가나다라마\" -> result = " + result );
		
		// [2] String의 생성자로 만든 인스턴스를 == 연사자로 비교한 경우
		result = new String( "가나다라마" ) == new String( "가나다라마" );
		System.out.println( "[2] new String(\"가나다라마\") == new String(\"가나다라마\") -> result = " + result );
		
	}

}
