package com.example;

public class President extends Employee {
	public void speech() {
		System.out.println( "여러분 힘냅시다!" );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		President president = new President();
		
		president.setName( "길동" );
		president.setPosition( "사장" );
		president.work();
		president.speech();
	}

}
