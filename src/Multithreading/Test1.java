package Multithreading;

public class Test1 extends Thread {
	
		public void run()
		{
			System.out.println("task1");
		}
		public static void main(String [] args) {
			Test thread1=new Test();
			thread1.start();
			
			Test thread2=new Test();
			thread2.start();
		}


}


//
//case2
//
//performing single task from multiple thread
