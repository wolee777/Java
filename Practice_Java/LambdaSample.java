package com.example;

public class LambdaSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ó���� ���ٽ����� �����Ѵ�.
		InterfaceSample lambda = ( String name ) -> {
			System.out.println( name + "�Դϴ�." );
		};
		
		lambda.sampleMethod( "�浿" ); 
	}

}
