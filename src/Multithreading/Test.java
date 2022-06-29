package Multithreading;

public class Test extends Thread {
	public void run()
	{
		System.out.println("task1");
	}
	public static void main(String[] args) {
		Test thread1=new Test();
		thread1.start();
	}

}



//case1
//
//performing single task from single thread