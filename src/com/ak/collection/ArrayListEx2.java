package com.ak.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx2 {

	
	public static void main(String[] args) {
		List<Student> l=new ArrayList<>();
		 l.add(new Student(1, "raja"));
		 l.add(new Student(2, "rajash"));
		 l.add(new Student(3, "rani"));
		 l.add(new Student(4, "raj"));
		 
		 System.out.println(l);
		 System.out.println("________using traditional for loop_____________");
		 for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
		 System.out.println("__________foreach_____________");
		 for(Student s:l) {
			 System.out.println(s);
		 }
		 System.out.println("________foreach method____________");
		 l.forEach(i->System.out.println(i));
		 
		 System.out.println("________foreach +method refrence____________");
		 l.forEach(System.out::println);
		 
		 System.out.println("_________using Iterator__________");
		   Iterator<Student> it= l.iterator();
		   
		   while (it.hasNext()) {
			 System.out.println(it.next()); 
			
		    }//while
		 
		   System.out.println("_________using ListIterator__________");
		   Iterator<Student> lit= l.listIterator();
		   
		   while (lit.hasNext()) {
			 System.out.println(lit.next()); 
			
		    }//while
		   
		   System.out.println("_________using ListIterator reverse order__________");
		  
		   ListIterator<Student> lit2= l.listIterator();
		   while(lit2.hasNext()) {
			   //System.out.println(lit2.next());
			   lit2.next();
		   }
		   
		   System.out.println("________________");
		   while (lit2.hasPrevious()) {
			 System.out.println(lit2.previous()); 
			
		    }//while

	}//main

}//class
