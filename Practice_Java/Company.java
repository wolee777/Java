package com.example;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��� Ŭ������ �ν��Ͻ� ����
		Employee emp = new Employee();
		
		// �Ƹ�����Ʈ Ŭ������ �ν��Ͻ� ����
		PartTime part = new PartTime();
		
		// ���� ����
		emp.setPosition( "�Ϲݻ��" );
		part.setPosition( "�Ƹ�����Ʈ" );
		
		// ���ϱ�
		emp.work();
		part.work();
		part.empWork();
	}

}
