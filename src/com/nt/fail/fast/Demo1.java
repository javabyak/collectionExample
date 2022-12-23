package com.nt.fail.fast;

import java.util.LinkedList;

public class Demo1 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		System.out.println(list);
		//try to  change data structure while travelling the collection
		
		for(Integer i:list) {
			System.out.println(i);
			/**
			 * fail fast collection
			 */
			/*if(i==100)
				list.add(500);*/
		}

	}

}
