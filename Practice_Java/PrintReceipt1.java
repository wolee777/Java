package com.example;

import java.math.BigDecimal;

public class PrintReceipt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ������ �ۼ�
		Detail detail = new Detail();
		detail.setItemName( "��5kg" );
		detail.setAmount( new BigDecimal( 15000 ) );
		
		// ���� ���� ������ ����
		StringBuilder sb = new StringBuilder();
		sb.append( detail.getItemName() );
		sb.append( "           " );
		sb.append( detail.getAmount() );
		sb.append( "��" );
		
		// ���� ���� ���
		System.out.println( sb.toString() );
	}

}
