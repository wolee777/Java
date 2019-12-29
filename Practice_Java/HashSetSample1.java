package com.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		// 요소 저장
		set.add( "개" );
		set.add( "고양이" );
		set.add( "토끼" );
		
		// 요소 표시
		System.out.println( "*** 첫 번째 표시 ***" );
		for ( String animal : set ) {
			System.out.println( animal );
		}
		
		// 요소 삭제
		set.remove( "토끼" );
		
		// 요소가 포함됐는지 확인한다.
		System.out.println( "*** 존재 확인 ***" );
		System.out.println( set.contains( "토끼" ) );
		
		// 요소 표시
		System.out.println( "*** 두 번째 표시 ***" );
		for ( String animal : set ) {
			System.out.println( animal );
		}
	}

}
