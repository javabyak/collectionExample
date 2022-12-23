package com.nt.hashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Demo4 {

	public static void main(String[] args) {
		HashMap< String,Integer> map=new HashMap<>();
		
		//here for checking duplicate equal() method used in internally
		map.put("ak",100);
		map.put("rk",200);
		map.put("dk",300);
		map.put("bk",400);
		map.put("ak",500); //here new value replace
		
		System.out.println(map);
		
	  map.forEach((a,b)->System.out.println(a+" "+b) );
	  System.out.println("____________________________");
	  
	  IdentityHashMap<String,Integer> ihm=new IdentityHashMap<>();
	//here for checking duplicate "==" operator used (i.e.cked by address) used in internally
	    ihm.put("ak",100);
		ihm.put("rk",200);
		ihm.put("dk",300);
		ihm.put("bk",400);
		ihm.put(new String("ak"),500);
		System.out.println(ihm);
		
	   ihm.forEach((a,b)->System.out.println(a+" "+b) );

	}

}
