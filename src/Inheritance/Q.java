package Inheritance;

public class Q extends P {
	void showQ() {
		System.out.println("hdadf");
}
	public static void main(String[] args) {
		Q ob1=new Q();
		ob1.showQ();
		Q ob2=new Q();
		ob2.showP();
	}
}
