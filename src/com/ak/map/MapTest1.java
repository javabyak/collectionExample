package com.ak.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest1 {

	public static void main(String[] args) {
		Map<Integer, String> map= new HashMap<>();
		map.put(101, "raja");
		map.put(102, "anshu");
		map.put(103, "rani");
		
		System.out.println(map);
		
		Set<Entry<Integer,String>> entry=map.entrySet();
		
		for(Entry<Integer,String> en:entry) {
			 System.out.println(en.getKey()+"  "+en.getValue());
		}
		System.out.println(map.get(101));
		System.out.println(map.size());
		
		Set<Integer> key=map.keySet();
		for(Integer a:key) {
			System.out.println(a);
		}

	}

}
