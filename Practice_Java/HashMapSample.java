package com.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		
		// 키와 값을 쌍으로 저장
		map.put( "빨강", "사과" );
		map.put( "보라", "포도" );
		map.put( "노랑", "귤" );
		
		// 요소 삭제
		map.remove( "빨강" );
		
		// 값 표시
		for ( String key : map.keySet() ) {
			String value = map.get( key );
			System.out.println( value );
		}
	}

}
