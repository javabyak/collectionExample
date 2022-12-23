package com.ak.collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExp {

	public static void main(String[] args) {
		/**
		 * 1.internally maintained growable array algorithm
		 * 2.it's Legacy class
		 * 3.this is thread safe
		 */
		Vector<Object> v=new Vector<>();
		v.add("ak");
		v.add(1000);
		v.add(100.57);
		v.add(null);
		v.add(1000);
		
		System.out.println(v);
		
		Enumeration<Object> en=v.elements();
		while (en.hasMoreElements()) {
			System.out.println(en.nextElement()); 
			
		}

	}

}
