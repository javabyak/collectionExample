package com.nt.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<>();
		
		list.add(new Student(101,"ak",2500.0));
		list.add(new Student(103,"rk",200.0));
		list.add(new Student(102,"dk",2300.0));
		list.add(new Student(105,"bk",2700.0));
		
		Collections.sort(list);
		
		//list.forEach(System.out::println);
		for(Student st:list) {
			System.out.println(st);
		}

	}

}
