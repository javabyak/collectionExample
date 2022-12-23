package com.nt.stream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
	     List<Object[]> list=List.of(new Object[] {101,"aa"},
	    		                     new Object[] {102,"bb"},
	    		                     new Object[] {103,"cc"},
	    		                     new Object[] {104,"dd"} );
	     
	       //using java stream api(list convert into map)
	     
	     Map<Integer, String> map=list 
	    		                  .stream()
	    		                  .collect(Collectors.toMap(ob->Integer.parseInt(ob[0].toString()), ob->ob[1].toString()));
	     
	    System.out.println(map);
	     
	    
	    //using java for each(list convert into map)
	    Map<Integer, String> map2=new HashMap<>();
	    
	    for(Object[] obj:list) {
	    	  map2.put(Integer.valueOf(obj[0].toString()), obj[1].toString());
	    }
	    
	    System.out.println(map2);
	    
		}
	}


