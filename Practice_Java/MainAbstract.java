package com.example;

public class MainAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeAbstract employee1;
		EmployeeAbstract employee2;
		
		employee1 = new ManagerAbstract();
		employee2 = new PartTimeAbstract();
		
		employee1.echo();
		employee2.echo();
	}

}
