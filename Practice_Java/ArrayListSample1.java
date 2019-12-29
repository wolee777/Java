package com.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		// 맨 끝에 요소 추가
		list.add( 17 );
		list.add( 51 );
		list.add( 39 );
		
		// 요소 표시
		System.out.println( "*** 첫 번째 표시 ***" );
		System.out.println( "0번 요소 : " + list.get( 0 ) );
		System.out.println( "1번 요소 : " + list.get( 1 ) );
		System.out.println( "2번 요소 : " + list.get( 2 ) );
		
		// 요소 삭제
		list.remove( 1 );
		
		// 요소 표시
		System.out.println( "*** 두 번째 표시 ***" );
		System.out.println( "0번 요소 : " + list.get( 0 ) );
		System.out.println( "1번 요소 : " + list.get( 1 ) );
	}

}
