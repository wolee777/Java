package com.example;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		// �� ���� ��� �߰�
		list.add( "ö��" );
		list.add( "����" );
		list.add( "�浿" );
		
		// ��� ��� ǥ��
		System.out.println( "*** ��� ��� ǥ��(for�� ���) ***" );
		for( int i = 0; i < list.size(); ++i ) {
			System.out.println( i + "�� : " + list.get( i ) );
		}
		
		// ��� ��� ǥ��
		System.out.println( "*** ��� ��� ǥ��(Ȯ�� for�� ���) ***" );
		for( String value : list ) {
			System.out.println( value );
		}

	}

}
