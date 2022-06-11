package com.sanket;

abstract class vehicle {
	abstract void start();

}
class car extends vehicle
{
	void start()
	{
		System.out.println("car start with key");
	}
}
//class scooter extends vehicle
//{
//	void start()
//	{
//		System.out.println("scooter starts with kick");
//	}
//
//	
//	public static void main(String [] args) {
//		car c=new car ();
//		c.start();
//		scooter s=new scooter();
//		s.start();
//	}
//}
