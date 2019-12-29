package com.example;

/**
 * int가 최댓값을 넘을 때의 동적을 확인하는 클래스
 */
public class OverflowCheck1 {

	/**
	 * 최댓값에 1을 더한 값을 출력합니다.
	 * 
	 * @param args
	 * 			명령줄 인수. 이번에는 사용하지 않습니다.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = Integer.MAX_VALUE;
		System.out.println( i );
		i = i + 1;
		System.out.println( i );
	}

}
