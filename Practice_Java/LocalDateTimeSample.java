package com.example;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class LocalDateTimeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ �������� �ʴ� ��¥�� �ð� ����
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println( localDateTime );
		
		// ������ ������ ��¥�� �ð� ����
		OffsetDateTime offsetDateTime = OffsetDateTime.of( 2020, Month.APRIL.getValue(), 8, 10, 20, 30, 0, ZoneOffset.of( "+09:00" ) );
		System.out.println( offsetDateTime );
		
		// ������ ���� ������ ������ ��¥�� �ð� ����
		ZonedDateTime zonedDateTime = ZonedDateTime.parse( "2025-07-24T11:12+09:00[Asia/Seoul]" );
		System.out.println( zonedDateTime );
	}

}
