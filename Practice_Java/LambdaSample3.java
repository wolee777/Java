package com.example;

public class LambdaSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 처리를 람다식으로 구현한다.(인수 형의 괄호를 생략한다.)
		InterfaceSample1 lambda = name -> {
			return name + "입니다.";
		};
		
		System.out.println( lambda.sampleMethod( "길동" ) );
	}

}
