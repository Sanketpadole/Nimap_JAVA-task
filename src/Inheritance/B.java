package Inheritance;

public class B extends A {
	void showD() {
		System.out.println("hisoi");
	}
	public static void main(String [] args) {
		B ob1=new B();
		ob1.showD();
		B ob2=new B();
		ob2.showC();
	}

}
