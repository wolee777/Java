package com.example;

public class LambdaSample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ó���� ���ٽ����� �����Ѵ�.(�μ� ���� ��ȣ�� �����Ѵ�.)
		InterfaceSample1 lambda = name -> {
			return name + "�Դϴ�.";
		};
		
		System.out.println( lambda.sampleMethod( "�浿" ) );
	}

}
