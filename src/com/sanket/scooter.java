package com.sanket;

//public class scooter {
	class scooter extends vehicle
	{
		void start()
		{
			System.out.println("scooter starts with kick");
		}

		
		public static void main(String [] args) {
			car c=new car ();
			c.start();
			scooter s=new scooter();
			s.start();
		}
	}


