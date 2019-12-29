package com.example;

public class ManagerDelegate {
	EmployeeDelegate employee = new EmployeeDelegate();
	
	public void echo() {
		employee.echo();
	}
}
