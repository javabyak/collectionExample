package com.ak.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Object> list=new ArrayList<>();
		
		list.add(100);
		list.add("ak");
		list.add(200.0);
		list.add("anshu");
		list.add(20);
		
		System.out.println(list);
		// o/p:[100, ak, 200.0, anshu, 20]
		
		//add element at 2nd index position
		list.add(2, 100);
		System.out.println(list);
		// o/p: [100, ak, 100, 200.0, anshu, 20]
		
		list.remove(2);  //remove element at 2nd index
		System.out.println(list);
		// o/p:[100, ak, 200.0, anshu, 20]
		
		//replace element from 4 index position
		list.set(4, "verma");
		System.out.println(list);
		//  o/p:[100, ak, 200.0, anshu, verma]
		
		List l2=new ArrayList<Object>();
		l2.add(100);
		l2.add("ak");
		l2.add(400);
		
		l2.retainAll(list);
		System.out.println(l2);
		//o/p:[100, ak]
		
		//find index of element
		
		System.out.println("index of element anshu::"+list.indexOf("anshu"));

	}

}
