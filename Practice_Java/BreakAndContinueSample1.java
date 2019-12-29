package com.example;

/**
 * break 문과 continue 문 예제를 실행하고 내용을 확인하는 클래스입니다.
 */
public class BreakAndContinueSample1 {

	/**
	 * break 문과 continue 문을 실행하고 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 변수 i가 1인 경우 루프 종료
		System.out.println( "------- [1] break -------" );
		for ( int i = 0; i < 3; ++i ) {
			if ( i == 1 ) {
				break;
			}
			System.out.println( "i = " + i );
		}
		
		// 변수 i가 1인 경우 현재 순서를 스킵
		System.out.println( "------- [2] continue -------" );
		for ( int i = 0; i < 3; ++i ) {
			if ( i == 1 ) {
				continue;
			}
			System.out.println( "i = " + i );
		}
		
	}

}
