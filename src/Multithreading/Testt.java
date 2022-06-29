package Multithreading;

public class Testt {
	public static void main(String[] args) {
		MyThread1 thread1=new MyThread1();
		thread1.start();
		
		MyThread1 thread2=new MyThread1();
		thread2.start();
		
		MyThread1 thread3=new MyThread1();
		thread3.start();
		
	}

}
