package com.example;

/**
 * for �� ������ �����ϰ� ������ Ȯ���ϴ� Ŭ�����Դϴ�.
 */
public class ForStatement {

	/**
	 * for ���� �����ϰ� ������ Ȯ���մϴ�.
	 * 
	 * @param args
	 * 			����� �μ�. �̹����� ������� �ʽ��ϴ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// [1] for ��
		System.out.println( "------- ī���͸� �̿��� ���� -------" );
		String stringValue = "�����ٶ�";
		for ( int i = 0; i < stringValue.length(); ++i ) {
			System.out.println( "[1] " + stringValue.charAt( i ) );
		}
		
		System.out.println( "------- �迭�� �̿��� ���� -------" );
		char[] chars = stringValue.toCharArray();
		for ( char charValue : chars ) {
			System.out.println( "[2] " + charValue );
		}
		
	}

}
