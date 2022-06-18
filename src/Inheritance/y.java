package Inheritance;

public class y extends x{
	void Test2() {
		System.out.println("world");
	}
	public static void main(String [] args) {
		y ob2=new y();
		ob2.Test2();
		ob2.Test1();
	}

}
