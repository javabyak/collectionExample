package com.nt.comparator;

import java.util.ArrayList;
import java.util.Collections;

import com.nt.comparator.Student;

public class ComparatorTest01 {

	public static void main(String[] args) {
        ArrayList<Student> list=new ArrayList<>();
		
		list.add(new Student(101,"ak",2500.0));
		list.add(new Student(103,"rk",200.0));
		list.add(new Student(102,"dk",2300.0));
		list.add(new Student(105,"bk",2700.0));
		
		//before sorting
		System.out.println("before sort::");
		list.forEach(System.out::println);
		
		Collections.sort(list, new StudentIdComparator());
		System.out.println("after sort::");		list.forEach(System.out::println);
		
		Collections.sort(list,new StudentNameComparator());
		System.out.println("sorted by name::");
		list.forEach(System.out::println);
		

	}

}
