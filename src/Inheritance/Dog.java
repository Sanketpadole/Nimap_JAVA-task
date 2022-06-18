package Inheritance;

//public class Dog {
//	void run() {
//		System.out.println("dog is running");
//	}
//	public static void main(String [] args) {
//		Dog d=new Dog();
//		d.run();
//		d.eat();
//	}
//
//}

//
//we cant access a method of one class into another for accessing the method of one class into another we have to use an extends keyword
public class Dog extends Animal {
	void run() {
		System.out.println("dog is running");
	}
	public static void main(String [] args) {
		Dog d=new Dog();
		d.run();
		d.eat();
	}

}