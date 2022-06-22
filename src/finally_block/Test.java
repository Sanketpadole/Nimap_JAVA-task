package finally_block;

public class Test {
	public static void main(String[] args) {
		try
		{
			int a=100;
			int b=0;
			int c;
			c=a/b;
			System.out.println(c);
					
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception:"+e);
		}
		finally
		{
			System.out.println("i am in finally block");
		}

	}

}
//if there is exception in try block still finally block will execute and even if there is no exception, finally block will execute
