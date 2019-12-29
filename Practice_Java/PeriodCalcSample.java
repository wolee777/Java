package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodCalcSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate localDate1 = LocalDate.of( 2018, Month.MAY.getValue(), 1 );
		LocalDate localDate2 = LocalDate.of( 2019, Month.JUNE.getValue(), 2 );
		
		Period period = Period.between( localDate1, localDate2 );
		
		LocalDate localDate3 = localDate2.plus( period );
		
		System.out.println( localDate3 );
	}

}
