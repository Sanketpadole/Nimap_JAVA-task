package Interface1;

class Test1 implements I2,I3
{


	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("2");
	}
	public static void main(String[] args) {
		Test1 t =new Test1();
		t.show();
		t.display();
	}
}
