package com.example;

public class People {
	private String name = "Hong";
	private String hobby = "sleeping";

	public People() {
	}
	
	public People( String name, String hobby ) {
		this.name = name;
		this.hobby = hobby;
	}
	
	public void introduceYourself() {
		this.sayHello();
		System.out.println( this.name );
		System.out.println( this.hobby );
	}
	
	private void sayHello() {
		String greeting = "æ»≥Á«œººø‰";
		System.out.println( greeting );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People hong = new People();
		
		hong.introduceYourself();
		
		System.out.println();
		
		People kim = new People( "Kim", "soccer" );
		kim.introduceYourself();
	}

}
