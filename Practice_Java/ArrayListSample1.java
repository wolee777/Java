package com.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		// �� ���� ��� �߰�
		list.add( 17 );
		list.add( 51 );
		list.add( 39 );
		
		// ��� ǥ��
		System.out.println( "*** ù ��° ǥ�� ***" );
		System.out.println( "0�� ��� : " + list.get( 0 ) );
		System.out.println( "1�� ��� : " + list.get( 1 ) );
		System.out.println( "2�� ��� : " + list.get( 2 ) );
		
		// ��� ����
		list.remove( 1 );
		
		// ��� ǥ��
		System.out.println( "*** �� ��° ǥ�� ***" );
		System.out.println( "0�� ��� : " + list.get( 0 ) );
		System.out.println( "1�� ��� : " + list.get( 1 ) );
	}

}
