package com.example;

public class LambdaSample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 처리를 람다식으로 구현한다.(return과 괄호를 생략한다.)
		InterfaceSample1 lambda = name -> name + "입니다.";
		
		System.out.println( lambda.sampleMethod( "길동" ) );
	}

}
