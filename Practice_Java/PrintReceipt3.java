package com.example;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class PrintReceipt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구매 내역 데이터 작성
		Detail detail1 = new Detail();
		detail1.setItemName( "쌀5kg" );
		detail1.setAmount( new BigDecimal( 15000 ) );
		
		Detail detail2 = new Detail();
		detail2.setItemName( "감9개" );
		detail2.setAmount( new BigDecimal( 9000 ) );
				
		List<Detail> detailList = new ArrayList();
		detailList.add( detail1 );
		detailList.add( detail2 );
		
		// 구매 내역 문자열 서식 정의
		String lineBase = "%-10s%10s원";
		
		// 금액 표시용 서식 지정
		DecimalFormat df = new DecimalFormat( "###,##0" );
		
		// 금액을 표시용으로 가공
		String dispAmount1 = df.format( detail1.getAmount().longValue() );
		String dispAmount2 = df.format( detail2.getAmount().longValue() );
		
		// 문자열 데이터 가공
		String result1 = String.format( lineBase, detail1.getItemName(), dispAmount1 );
		String result2 = String.format( lineBase, detail2.getItemName(), dispAmount2 );
		
		// 구매 내역 출력
		System.out.println( result1 );
		System.out.println( result2 );
	}

}
