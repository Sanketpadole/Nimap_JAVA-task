package constructor;

public class Test2 {
	Test2(int a)
	{
		System.out.println("parameterised constructor");
	}
	public static void main(String [] args) {
		Test2 t2=new Test2(10);
	}

}
