package com.nt.newfeature;

interface Vehical{
	//abstract method
	public void start();
	
	//default method
	public default void clean() {
		System.out.println("car cleaned...");
	}
	
	//static method
	public static void stop() {
		System.out.println("car stop");
	}
	
}

public class Car  implements Vehical{
	 
	//default method is possible to override
	
	@Override
	public void clean() {
		System.out.println("my car cleaner");
	}

	@Override
	public void start() {
		System.out.println("car started....");
		
	}

}

