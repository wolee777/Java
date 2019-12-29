package com.example;

public abstract class EmployeeAbstract {
	private String name;
	
	// 이름 게터
	public String getName() {
		return name;
	}
	
	// 이름 세터
	public void setName( String name ) {
		this.name = name;
	}
	
	// 응답 메서드
	public abstract void echo();
}
