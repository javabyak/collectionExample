package com.nt.consumer;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> c=(s)->System.out.println("good night::"+s);
		  c.accept("akshay");

	}

}
