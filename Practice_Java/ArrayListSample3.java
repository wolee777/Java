package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		// 맨 끝에 요소 추가
		list.add( "철수" );
		list.add( "영희" );
		list.add( "길동" );
		
		// 이터레이터 선언
		Iterator<String> it = list.iterator();
		
		// 모든 요소 표시
		while( it.hasNext() ) {
			// 요소 추출
			String name = it.next();
			System.out.println( name );
		}
	}

}
