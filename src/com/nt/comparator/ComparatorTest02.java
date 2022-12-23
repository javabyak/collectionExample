package com.nt.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorTest02 {

	public static void main(String[] args) {
		/*
		 * List<Employee> list=List.of(new Employee(102, "radha", 3000.0), new
		 * Employee(101, "ak", 3500.0), new Employee(105, "sk", 2000.0), new
		 * Employee(104, "ak", 3400.0));
		 */
		//can not perform operation on immutable collection
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(102, "radha", 3000.0));
		list.add(new Employee(101, "ak", 3500.0));
		list.add(new Employee(105, "sk", 2000.0) );
		list.add(new Employee(104, "tk", 2200.0));
		
		
		System.out.println("before sort::");
		list.forEach(System.out::println);
		Collections.sort(list, (e1,e2)-> (e1.getEno()>e2.getEno())?1: (e1.getEno()<e2.getEno())?-1: 0);
		
		System.out.println("after sort::");
		list.forEach(System.out::println);
		

	}

}
