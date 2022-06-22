package Constructor_Overloading;

public class Test {
	int a=10;
	String b="sanket";
	Test(){
		System.out.println("Default");
	}
	Test(int a){
		System.out.println("one arg");
	}
	Test(int a,int b){
		System.out.println("two arg");
	}
	Test(int a,int b,String c){
		System.out.println("three arg");
	}
	public static void main(String[] args) {
		Test t=new Test(7,9);
		Test t1=new Test(3,4,"sanket");
	}
	

}



//
//
//constructor overloading enables the creation of the object of a specific class in a several ways,programmer can use the data according to requirement......and object can be initialize with different datatypes


