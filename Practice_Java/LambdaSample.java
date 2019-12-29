package com.example;

public class LambdaSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 처리를 람다식으로 구현한다.
		InterfaceSample lambda = ( String name ) -> {
			System.out.println( name + "입니다." );
		};
		
		lambda.sampleMethod( "길동" ); 
	}

}
