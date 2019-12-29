package com.example;

/**
 * break 문과 continue 문 예제를 실행하고 내용을 확인하는 클래스입니다.
 */
public class BreakAndContinueSample3 {

	/**
	 * break 문과 continue 문을 실행하고 내용을 확인합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( "------- [1] 레이블이 지정된 루프에서 break -------" );
		label: for ( int i = 0; i < 3; ++i ) {
			for ( int j = 0; j < 3; ++j ) {
				if ( j == 1 ) {
					System.out.println( "j == 1일 때 label에 대한 break" );
					break label;
				}
				System.out.println( "i = " + i + ", j = " + j );
			}
		}
		
		System.out.println( "------- [2] 레이블이 지정된 루프에서 continue -------" );
		label: for ( int i = 0; i < 3; ++i ) {
			for ( int j = 0; j < 3; ++j ) {
				if ( j == 1 ) {
					System.out.println( "j == 1일 때 label에 대한 continue" );
					continue label;
				}
				System.out.println( "i = " + i + ", j = " + j );
			}
		}
	}

}
