package com.example;

import java.util.Calendar;

public class CalendarSample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		
		cal1.set( Calendar.DAY_OF_MONTH, 1 );
		cal2.set( Calendar.DAY_OF_MONTH, 2 );
		
		System.out.println( cal1.getTime() );
		System.out.println( cal2.getTime() );
		
		// cal1과 cal2를 비교한다.
		int result = cal1.compareTo( cal2 );
		System.out.println( result );
	}

}
