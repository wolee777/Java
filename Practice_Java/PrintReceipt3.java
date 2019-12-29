package com.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PrintReceipt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ���� ������ �ۼ�
		Detail detail1 = new Detail();
		detail1.setItemName( "��5kg" );
		detail1.setAmount( new BigDecimal( 15000 ) );
		
		Detail detail2 = new Detail();
		detail2.setItemName( "��9��" );
		detail2.setAmount( new BigDecimal( 9000 ) );
				
		List<Detail> detailList = new ArrayList();
		detailList.add( detail1 );
		detailList.add( detail2 );
		
		// ���� ���� ���ڿ� ���� ����
		String lineBase = "%-10s%10s��";
		
		// �ݾ� ǥ�ÿ� ���� ����
		DecimalFormat df = new DecimalFormat( "###,##0" );
		
		// �ݾ��� ǥ�ÿ����� ����
		String dispAmount1 = df.format( detail1.getAmount().longValue() );
		String dispAmount2 = df.format( detail2.getAmount().longValue() );
		
		// ���ڿ� ������ ����
		String result1 = String.format( lineBase, detail1.getItemName(), dispAmount1 );
		String result2 = String.format( lineBase, detail2.getItemName(), dispAmount2 );
		
		// ���� ���� ���
		System.out.println( result1 );
		System.out.println( result2 );
	}

}
