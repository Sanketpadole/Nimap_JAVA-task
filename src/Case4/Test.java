package Case4;

public class Test {
	public static void main(String[] args) {
		MyThread1 thread1=new MyThread1();
		thread1.start();
		
		MyThread2 thread2=new MyThread2();
		thread2.start();
	}

}
