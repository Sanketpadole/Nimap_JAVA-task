package com.sanket;

 class Scooter1 extends vehicle1 {
	 void start()
	 {
		 System.out.println("Scooter start with kick");
	 }
	 public static void main(String [] args) {
		 car c1=new car();
		 c1.start();
		 Scooter1 s1=new Scooter1();
		 s1.start();
	 }

}
