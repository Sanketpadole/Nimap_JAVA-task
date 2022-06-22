package Objects;

public class Calc {
	int num1;
	int num2;
	int res;
	public void result() {
		res=num1+num2;
		System.out.println(res);
	}
	public static void main(String [] args) {
		Calc add=new Calc();
		add.num1=5;
		add.num2=4;
		add.result();
	}

}







