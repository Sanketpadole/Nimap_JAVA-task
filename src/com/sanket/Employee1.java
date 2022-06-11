package com.sanket;

public class Employee1 {
	int empid;
	String name;
	String company;
	
	Employee1(int empid,String name,String company)
	{
		this.empid=empid;
		this.name=name;
		this.company=company;
	}
	
	void display()
	{
		System.out.println(empid+" "+name+" "+company);
	}
	public static void main(String [] args)
	{
		Employee1 e1 = new Employee1(101,"amit","smart programming");
		e1.display();
		
		Employee1 e2=new Employee1(102,"Deepak","smart programming");
				e2.display();
	}

}
