package com.ak.map;

import java.util.TreeMap;

public class TreeMapDemo {
	/**
	 * 1.natural sorting order maintained by key
	 * 2.internally maintained binary try algorithm
	 * 
	 */

	public static void main(String[] args) {
		TreeMap<Integer, String> tmap=new TreeMap<>();
		tmap.put(100,"akshay");
		tmap.put(200,"rani");
		tmap.put(150, "raja");
		
		System.out.println(tmap);

	}

}
