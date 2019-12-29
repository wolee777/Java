package com.example;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Calendar;
import java.util.Date;

public class ExchangeDateTimeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime localDateTime1 = LocalDateTime.of( 2025, Month.DECEMBER.getValue(), 1, 2, 3, 4, 56780123 );
		
		System.out.println( "---------- ���� ���� �ð��� ��¥ ----------" );
		System.out.println( localDateTime1 );
		
		Instant instant1 = localDateTime1.toInstant( ZoneOffset.of( "+09:00" ) );
		
		// Instant���� Date�� ��ȯ
		Date date = Date.from( instant1 );
		System.out.println( "---------- java.util.Date�� �Ͻ� ----------" );
		System.out.println( date );
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime( date );
		System.out.println( "---------- java.util.Calendar�� �Ͻ� ----------" );
		System.out.println( calendar );
		
		Instant instant2 = date.toInstant();
		LocalDateTime localDateTime2 = LocalDateTime.ofInstant( instant2, ZoneId.of( "Asia/Seoul" ) );
		System.out.println( "---------- java.util.Date���� LocalDateTime���� �ǵ��� �� ----------" );
		System.out.println( localDateTime2 );
		
		// Calendar���� Instant�� ��ȯ
		Instant instant3 = calendar.toInstant();
		LocalDateTime localDateTime3 = LocalDateTime.ofInstant( instant3, ZoneId.of( "Asia/Seoul" ) );
		System.out.println( "---------- java.util.Calendar���� LocalDateTime���� �ǵ��� �� ----------" );
		System.out.println( localDateTime3 );
	}	

}
