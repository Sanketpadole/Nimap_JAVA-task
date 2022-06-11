package com.sanket;

public class Employee2 {


	int empid;
	String name;
	static String company="smart programming";
	
	Employee2(int empid,String name)
	{
		this.empid=empid;
		this.name=name;
//		this.company=company;
	}
	
	void display()
	{
		System.out.println(empid+" "+name+" "+company);
	}
	public static void main(String [] args)
	{
		Employee2 e1 = new Employee2(101,"amit");
		e1.display();
		
		Employee2 e2=new Employee2(102,"Deepak");
				e2.display();
	}

}


