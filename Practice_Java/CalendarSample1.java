package com.example;

import java.util.Calendar;
import java.util.Date;

public class CalendarSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.add( Calendar.DAY_OF_MONTH, 1 );
		// 출력용으로 Calendar 클래스에서 Date 클래스를 얻는다.
		Date nextMonth = cal.getTime();
		System.out.println( nextMonth );
	}

}
