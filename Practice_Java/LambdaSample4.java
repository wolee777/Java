package com.example;

public class LambdaSample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ó���� ���ٽ����� �����Ѵ�.(return�� ��ȣ�� �����Ѵ�.)
		InterfaceSample1 lambda = name -> name + "�Դϴ�.";
		
		System.out.println( lambda.sampleMethod( "�浿" ) );
	}

}
