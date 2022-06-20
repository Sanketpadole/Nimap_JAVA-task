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
	Test(int a,int b,int c){
		System.out.println("three arg");
	}
	public static void main(String[] args) {
		Test t=new Test(7,9);
	}
	

}
