package PrimitiveVsReference;

//public class Test {
//	public static void main(String[] args) {
//		int a=100;
//		int b=a;
//		System.out.println(b);
//	}
//
//}



//
//
//here a=100 which has an address 55 in memory  whereas we hv a variable b=a which has address 88 in memory...so in this primitive case variable a and variable b allocate a different place in memory so this variables are independent of each other
//
//primitive types hold the simple values







public class Test {
	public static void main(String[] args) {
		String s1="hello";
		String s2=s1;
		System.out.println(s2);
	}

}


Reference type holds the complex objects

//
//
//here first we will store the string "hello" which has an address 100 and we will create another box which is our variable s1, and the value of this variable is an address of string "hello" which is 100, s1 is also a variable which has an adress 600





now we are assigning s2=s1, the value of s1 i.e 600 will store in s2.....so adress of "hello" is inside s1 and s2.....hence s1 and s2 are different variables but reffering a same value that is "hello"