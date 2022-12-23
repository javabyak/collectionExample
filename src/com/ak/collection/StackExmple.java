package com.ak.collection;

import java.util.Stack;

public class StackExmple {

	public static void main(String[] args) {
		/**
		 * 1.internally maintain LIFO ordered algorithm
		 * 2.
		 */
		Stack<Object> s=new Stack<>();
		s.add(100);
		s.add(200);
		s.add(null);
		s.add(100);
		s.push(300);
		System.out.println(s);
		System.out.println(s.peek());//printed top most element(last element)
		System.out.println(s.pop());//remove last element and return
		System.out.println(s);

	}

}
