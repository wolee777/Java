package com.example;

public class AnonymousSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ó���� �͸� Ŭ������ �����Ѵ�.
		InterfaceSample anonymous = new InterfaceSample() {
			public void sampleMethod( String name ) {
				System.out.println( name + "�Դϴ�." );
			}
		};
		
		anonymous.sampleMethod( "�浿" );
	}

}
