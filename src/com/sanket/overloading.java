package com.sanket;

public class overloading {
	void show (int a,int b)
	{
		System.out.println("1");
	}
	void show (int a)
	{
		System.out.println("2");
	}
	public static void main(String []args)
	{
		overloading o=new overloading();
		o.show(10,20);
	}

}
