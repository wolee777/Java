package com.example;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = new HashSet<>();
		
		// ��� ����
		set.add( "��" );
		set.add( "�����" );
		set.add( "�䳢" );
		
		// ��� ǥ��
		System.out.println( "*** ù ��° ǥ�� ***" );
		for ( String animal : set ) {
			System.out.println( animal );
		}
		
		// ��� ����
		set.remove( "�䳢" );
		
		// ��Ұ� ���Եƴ��� Ȯ���Ѵ�.
		System.out.println( "*** ���� Ȯ�� ***" );
		System.out.println( set.contains( "�䳢" ) );
		
		// ��� ǥ��
		System.out.println( "*** �� ��° ǥ�� ***" );
		for ( String animal : set ) {
			System.out.println( animal );
		}
	}

}
