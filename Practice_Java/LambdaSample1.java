package com.example;

public class LambdaSample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ó���� ���ٻ����� �����Ѵ�.(�μ��� ������ �����Ѵ�.)
		InterfaceSample1 lambda = ( String name ) -> {
			return name + "�Դϴ�.";
		};
		
		System.out.println( lambda.sampleMethod( "�浿" ) );
	}

}
