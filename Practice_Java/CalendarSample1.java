package com.example;

import java.util.Calendar;
import java.util.Date;

public class CalendarSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.add( Calendar.DAY_OF_MONTH, 1 );
		// ��¿����� Calendar Ŭ�������� Date Ŭ������ ��´�.
		Date nextMonth = cal.getTime();
		System.out.println( nextMonth );
	}

}
