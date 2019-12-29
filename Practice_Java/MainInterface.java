package com.example;

public class MainInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iEmployee employee1;
		iEmployee employee2;
		
		employee1 = new ManagerInterface();
		employee2 = new PartTimeInterface();
		
		employee1.echo();
		employee2.echo();
	}

}
