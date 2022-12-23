package com.nt.lambda;

interface Inter{
	public void m1() ;
	}


class MyTest implements Inter{
	public void m1() {
		for (int i = 0; i <10; i++) {
			System.out.println("child thread");
		}
	}
}



public class MethodRefTest2 {
   
	public static void main(String[] args) {
		   MyTest t=new MyTest();
		   Runnable r=t::m1;
		   Thread th=new Thread(r);
		   th.start();
		
		   for (int i = 0; i <10; i++) {
			System.out.println("main thread");
		}
	}//main
}//class
