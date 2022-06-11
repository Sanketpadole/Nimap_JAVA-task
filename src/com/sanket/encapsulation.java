package com.sanket;

public class encapsulation {
	public static void main(String [] args) {
		int baseSalary=50000;
		int extraHour=10;
		int hourlyRate=20;
		
		int wage= calculateWage(baseSalary,extraHour,hourlyRate);
		System.out.println(wage);
	}

	private static int calculateWage(
			int baseSalary,
			int extraHour,
			int hourlyRate
			)
	{
		// TODO Auto-generated method stub
		return baseSalary + (extraHour * hourlyRate);
	}

}
