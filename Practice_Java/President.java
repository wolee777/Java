package com.example;

public class President extends Employee {
	public void speech() {
		System.out.println( "������ �����ô�!" );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		President president = new President();
		
		president.setName( "�浿" );
		president.setPosition( "����" );
		president.work();
		president.speech();
	}

}
