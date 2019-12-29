package com.example;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class DurationPeriodSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime localDateTime1 = LocalDateTime.of( 2018, Month.JUNE.getValue(), 10, 10, 10, 10, 000000000 );
		LocalDateTime localDateTime2 = LocalDateTime.of( 2019, Month.JULY.getValue(), 11, 11, 11, 11, 100000001 );
		
		Period period = Period.between( localDateTime1.toLocalDate(), localDateTime2.toLocalDate() );
		
		System.out.println( "---------- period Ư�� �׸��� ���� ----------" );
		System.out.println( "���� : " + period.getYears() );
		System.out.println( "���� : " + period.getMonths() );
		System.out.println( "���� : " + period.getDays() );
		
		System.out.println( "---------- period ���� ----------" );
		System.out.println( "���� ���� : " + period.toTotalMonths() );
		
		Duration duration = Duration.between( localDateTime1, localDateTime2 );
		System.out.println( "---------- duration Ư�� �׸��� ���� ----------" );
		System.out.println( "�и���~�������� : " + duration.getNano() );
		
		System.out.println( "---------- duration ���� ----------" );
		System.out.println( "���� ���� : " + duration.toDays() );
		System.out.println( "���� �ð��� : " + duration.toHours() );
		System.out.println( "���� ���� : " + duration.toMinutes() );
		System.out.println( "���� ���� : " + duration.getSeconds() );
		System.out.println( "���� �и����� : " + duration.toMillis() );
		System.out.println( "���� �������� : " + duration.toNanos() );
	}

}
