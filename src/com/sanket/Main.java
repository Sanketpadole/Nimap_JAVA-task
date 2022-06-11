package com.sanket;

public class Main {
	public static void main(String [] args) {
		var employee=new Employee();
		employee.baseSalary=50_000;
		employee.hourlyRate=20;
		int extraHour;
		int wage=employee.calculateWage(extraHour=18);
				System.out.println(wage);
	}

}
