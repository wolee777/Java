package com.example;

import java.math.BigDecimal;

public class PrintReceipt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ������ �ۼ�
		Detail detail1 = new Detail();
		detail1.setItemName( "��5kg" );
		detail1.setAmount( new BigDecimal( 15000 ) );
		
		Detail detail2 = new Detail();
		detail2.setItemName( "��9��" );
		detail2.setAmount( new BigDecimal( 9000 ) );
				
		// ���� ���� ���ڿ� ���� ����
		String lineBase = "%-10s%,10d��";
		
		// ���ڿ� ������ ����
		String result1 = String.format( lineBase, detail1.getItemName(), detail1.getAmount().longValue() );
		String result2 = String.format( lineBase, detail2.getItemName(), detail2.getAmount().longValue() );
		
		// ���� ���� ���
		System.out.println( result1 );
		System.out.println( result2 );
	}

}
