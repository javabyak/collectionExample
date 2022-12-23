package com.nt.streamEx;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {
	   ArrayList<Integer> mark=new ArrayList<>();
	     mark.add(25);
	     mark.add(56);
	     mark.add(45);
	     mark.add(70);
	     mark.add(34);
	     mark.add(95);
	     
	     System.out.println(mark);
	     mark.forEach(System.out::println);
	     
	    List<Integer>passStudentmark= mark.stream().filter(a -> a>=35).collect(Collectors.toList());
	    System.out.println("passStudentmark::"+passStudentmark);
	    Long passStude= mark.stream().filter(a -> a>=35).count();
	    System.out.println("pass student count::"+passStude);
	    
	    Long failstudent=mark.stream().filter(m ->m<35).count();
	    System.out.println("no. of fail student::"+failstudent);
	    
	    //add greass mark 5 in every student
	    
	    List<Integer> newMark=mark.stream().map(a -> a+5).collect(Collectors.toList());
	    System.out.println("new mark list is::"+newMark);
	    
	    //sorted student mark
	    List<Integer> SortedstudentList=mark.stream().sorted().collect(Collectors.toList());
	    System.out.println("SortedstudentList::"+SortedstudentList);
	    
	    // reverse sorted student mark
	    List<Integer> ReverseSortedstudentList=mark.stream().sorted((a,b)->b.compareTo(a)).collect(Collectors.toList());
	    System.out.println("ReverseSortedstudentList::"+ReverseSortedstudentList);
	    //find min
	    Integer min=mark.stream().min((a,b)->a.compareTo(b)).get();
	    System.out.println("min mark is::"+min);
	    
	    //find max
	    Integer max=mark.stream().max((a,b)->a.compareTo(b)).get();
	    System.out.println("max no is::"+max);
	    
	    Integer[] i=mark.stream().toArray(Integer[]::new);
	    //print the arry
	    //Stream.of(i).forEach(a-> System.out.println(a));
	    Stream.of(i).forEach(System.out::println);
	      
	    
	     

	}

}
