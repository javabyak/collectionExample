package com.nt.newfeature;

public class Test {
	public static void main(String[] args) {
		 Car c=new Car();
		 c.start();
		
		 //default method call by using object
		 c.clean();
		 
		 //static method call by only interface
		 Vehical.stop();
	}
}

