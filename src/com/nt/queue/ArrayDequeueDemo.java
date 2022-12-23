package com.nt.queue;

import java.util.ArrayDeque;

public class ArrayDequeueDemo {

	public static void main(String[] args) {
		ArrayDeque<Integer> dqueue=new ArrayDeque<>();
		dqueue.add(100);
		dqueue.add(200);
		dqueue.add(300);
		dqueue.add(100);
		System.out.println(dqueue);
		
		
		dqueue.addFirst(90);
		dqueue.addLast(60);
		System.out.println(dqueue);
		//remove first element
		dqueue.pollFirst();
		System.out.println(dqueue);
		
		//remove last element+
		dqueue.pollLast();
		System.out.println(dqueue);

	}

}
