package Access_Modifier;

public class Test {
	private int a=100;
	
	protected int b=88;
	
	private void show(){
		System.out.println("private method");
	}
	void show1() {
		System.out.println("default method");
		
	}
	public void show2() {
		System.out.println("public method");
		
	}
	protected void show3() {
		System.out.println("protected method");
		
	}

}
