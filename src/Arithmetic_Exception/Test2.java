package Arithmetic_Exception;

public class Test2 {
	public static void main(String[] args) 
	{
	try
	{
		int a=100;
		int b=0;
		int c;
		c=a/b;
		System.out.println(c);
	}

	
	catch(ArithmeticException  e)
	{
		System.out.println(e);
	}
	System.out.println("you cannot divide by zero");
}
}


//
//
//this time this program catching an exception and showing output.    this means this program is not terminated abnormally