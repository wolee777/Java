package com.example;

public class PartTime extends Employee {
	// 교대
	private String shift;
	
	// 교대 게터
	public String getShift() {
		return shift;
	}
	
	// 교대 세터
	public void setShift( String shift ) {
		this.shift = shift;
	}
	
	// 사원 클래스의 메서드를 오버라이딩한다.
	public void work() {
		System.out.println( getPosition() + " 입니다. 파트타임으로 " + "일을 합니다." );
	}
	
	// 사원 클래스의 메서드를 호출한다.
	public void empWork() {
		super.work();
	}
	
}
