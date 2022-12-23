package com.nt.function;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		Function<String, Integer> F=name->name.length();
		
		System.out.println(F.apply("akshay"));
		System.out.println(F.apply("raja"));

	}

}
