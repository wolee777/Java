package com.example;

public class LambdaSample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ó���� ���ٽ����� �����Ѵ�.(�μ��� �� ������ �����Ѵ�.)
		InterfaceSample1 lambda = ( name ) -> {
			return name + "�Դϴ�.";
		};
		
		System.out.println( lambda.sampleMethod( "�浿" ) );
	}

}
