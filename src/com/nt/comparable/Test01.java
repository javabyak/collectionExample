package com.nt.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(100);
		list.add(400);
		list.add(300);
		list.add(150);
		
		//before sort
		System.out.println("Before sort::"+list);
		
		Collections.sort(list);
		
		//After sort
		System.out.println("After sort::"+list);
		Collections.reverse(list);
		System.out.println("reverse list::"+list);
		

	}

}
