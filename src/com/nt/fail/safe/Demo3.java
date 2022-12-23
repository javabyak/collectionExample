package com.nt.fail.safe;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Demo3 {

	public static void main(String[] args) {
		ConcurrentHashMap<Integer, String> map=new ConcurrentHashMap<>();
		map.put(100, "ak");
		map.put(200, "rk");
		map.put(300, "dk");
		map.put(400, "bk");
		
		System.out.println(map);
		
	 Set<Integer> keyset=map.keySet();
	 
	Iterator<Integer> it= keyset.iterator();
	  
	//fail safe collection
	  while(it.hasNext()) {
		     System.out.println(it.next());
		     map.put(500, "hk");
	    }
	  System.out.println("after adding the data during traversing the collection::");
	  map.forEach((a,b)->System.out.println(a+" "+b) );

	}

}
