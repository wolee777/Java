package com.example;

public class PartTime extends Employee {
	// ����
	private String shift;
	
	// ���� ����
	public String getShift() {
		return shift;
	}
	
	// ���� ����
	public void setShift( String shift ) {
		this.shift = shift;
	}
	
	// ��� Ŭ������ �޼��带 �������̵��Ѵ�.
	public void work() {
		System.out.println( getPosition() + " �Դϴ�. ��ƮŸ������ " + "���� �մϴ�." );
	}
	
	// ��� Ŭ������ �޼��带 ȣ���Ѵ�.
	public void empWork() {
		super.work();
	}
	
}
