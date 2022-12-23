package com.ak.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkListEx {

	public static void main(String[] args) {
		/**
		 * 1.internally used double link list algorithem
		 * 2.Recommended for insertion record
		 */
        List<Object> ll=new LinkedList<>();
        ll.add("ak");
        ll.add(100);
        ll.add(101.5);
        ll.add(null);
        ll.add(100);
        
        System.out.println(ll);
        //using forEach with method refrence
        ll.forEach(System.out::println);
	}

}
