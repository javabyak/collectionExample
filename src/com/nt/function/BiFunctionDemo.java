package com.nt.function;

import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> F=(b,a) -> a*b;
		System.out.println(F.apply(30, 55));
		

	}

}
