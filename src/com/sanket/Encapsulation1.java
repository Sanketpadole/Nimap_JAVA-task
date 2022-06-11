package com.sanket;
class Student
{
	private int rollno;
	private String name;
	
	public void setRollno(int r)
	{
		rollno=r;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	
public static void main(String [] args)
	{
		Student s1=new Student();
		s1.setRollno(9);
//		s1.setname="HELLO";
		System.out.println(s1.getRollno());
	}
}

