package com.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		// �� ���� ��� �߰�
		list.add( "ö��" );
		list.add( "����" );
		list.add( "�浿" );
		
		// ���ͷ����� ����
		Iterator<String> it = list.iterator();
		
		// ��� ��� ǥ��
		while( it.hasNext() ) {
			// ��� ����
			String name = it.next();
			System.out.println( name );
		}
	}

}
