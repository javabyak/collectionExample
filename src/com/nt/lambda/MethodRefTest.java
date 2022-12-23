package com.nt.lambda;
interface MyInter{
	public static void m1() {
		for (int i = 0; i <10; i++) {
			System.out.println("child thread");
		}
	}
}



public class MethodRefTest {
    
	public static void main(String[] args) {
		Runnable r=MyInter::m1;
		   Thread th=new Thread(r);
		   th.start();
		for (int i = 0; i <10; i++) {
			System.out.println("main thread");
		}
	}//main
}//class
