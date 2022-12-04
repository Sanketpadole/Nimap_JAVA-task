package HierarchicalInheritance;

public class Q extends P {
	void showC() {
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		Q ob1=new Q();
		ob1.showC();
		Q ob2=new Q();
		ob2.showA();
		
	}

}
