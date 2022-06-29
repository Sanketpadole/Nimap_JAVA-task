package Methods_thread_class;

public class ThreadNameDemo {
	public static void main(String[] args) {
		System.out.println("hello");
		Thread.currentThread().setName("deepak");
		System.out.println(10/0);
	}

}
