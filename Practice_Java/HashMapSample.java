package com.example;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new HashMap<>();
		
		// Ű�� ���� ������ ����
		map.put( "����", "���" );
		map.put( "����", "����" );
		map.put( "���", "��" );
		
		// ��� ����
		map.remove( "����" );
		
		// �� ǥ��
		for ( String key : map.keySet() ) {
			String value = map.get( key );
			System.out.println( value );
		}
	}

}
