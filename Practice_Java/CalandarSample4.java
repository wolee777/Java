package com.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalandarSample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		cal.set( Calendar.DAY_OF_MONTH, 1 );
		// ��¿����� Calendar Ŭ�������� Date Ŭ������ ��´�.
		Date nextMonth = cal.getTime();
		System.out.println( nextMonth );
		// �����÷� ������ �������� ����Ѵ�.
		SimpleDateFormat sdf = new SimpleDateFormat( "yyyy/MM/dd" );
		String formatedStr = sdf.format( nextMonth );
		System.out.println( formatedStr );
	}

}
