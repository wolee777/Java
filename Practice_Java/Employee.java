package com.example;

public class Employee {
	// �̸�
	private String name;
	// ����
	private String position;
	
	// �̸� ����
	public String getName() {
		return name;
	}
	
	// ���� ����
	public String getPosition() {
		return position;
	}
	
	// �̸� ����
	public void setName( String name ) {
		this.name = name;
	}
	
	// ���� ����
	public void setPosition( String position ) {
		this.position = position;
	}
	
	// ��� �޼���
	public void clockIn() {
		System.out.println( this.name + " ����߽��ϴ�." );
	}
	
	// ��� �޼���
	public void clockOut() {
		System.out.println( this.name + " ����߽��ϴ�." );
	}
	
	// �ٹ� �޼���
	public void work() {
		System.out.println( this.position + " �Դϴ�. ���� �մϴ�." );
	}
	
}
