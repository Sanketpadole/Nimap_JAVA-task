package Abstraction;




	class Scooter extends Vehicle{
		void start()
		{
			System.out.println("scooter start with key");
		}
	
	public static void main(String [] args) {
		car c=new car();
		c.start();
		Scooter s=new Scooter();
		s.start();
	}
}
