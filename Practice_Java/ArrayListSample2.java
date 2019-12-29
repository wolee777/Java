package com.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		// 맨 끝에 요소 추가
		list.add( "철수" );
		list.add( "영희" );
		list.add( "길동" );
		
		// 모든 요소 표시
		System.out.println( "*** 모든 요소 표시(for문 사용) ***" );
		for( int i = 0; i < list.size(); ++i ) {
			System.out.println( i + "번 : " + list.get( i ) );
		}
		
		// 모든 요소 표시
		System.out.println( "*** 모든 요소 표시(확장 for문 사용) ***" );
		for( String value : list ) {
			System.out.println( value );
		}

	}

}
