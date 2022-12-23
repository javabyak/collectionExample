package com.nt.fail.safe;

import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo2 {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		System.out.println("before adding::"+list);
		//try to  change data structure while travelling the collection
		
		for(Integer i:list) {
			System.out.println(i);
			/**
			 * fail safe collection
			 */
			if(i==100)
				list.add(500);
		}
		
		System.out.println("after adding data::"+list);

	}

}
