package com.nt.fail.fast;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(100, "ak");
		map.put(200, "rk");
		map.put(300, "dk");
		map.put(400, "bk");
		
		System.out.println(map);
		
	 Set<Integer> keyset=map.keySet();
	 
	Iterator<Integer> it= keyset.iterator();
	  
	//fail fast collection
	  while(it.hasNext()) {
		     System.out.println(it.next());
		     map.put(500, "hk");
	    }

	}

}
