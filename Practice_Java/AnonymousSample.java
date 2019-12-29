package com.example;

public class AnonymousSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 처리를 익명 클래스로 구현한다.
		InterfaceSample anonymous = new InterfaceSample() {
			public void sampleMethod( String name ) {
				System.out.println( name + "입니다." );
			}
		};
		
		anonymous.sampleMethod( "길동" );
	}

}
