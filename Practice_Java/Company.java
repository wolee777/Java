package com.example;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사원 클래스의 인스턴스 생성
		Employee emp = new Employee();
		
		// 아르바이트 클래스의 인스턴스 생성
		PartTime part = new PartTime();
		
		// 직위 설정
		emp.setPosition( "일반사원" );
		part.setPosition( "아르바이트" );
		
		// 일하기
		emp.work();
		part.work();
		part.empWork();
	}

}
