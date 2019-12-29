package com.example;

public class MainGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsSample<String> generic = new GenericsSample<String>();
		
		generic.setObject( "æ»≥Á«œººø‰." );
		
		System.out.println( generic.getObject() );
	}

}
