package com.nt.predicateEx;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
  
public class PredicateDemo {
	
	

	public static void main(String[] args) {
		Employee emp1=new Employee(101, "akshay", "BA");
		Employee emp2=new Employee(102, "ak", "dev");
		Employee emp3=new Employee(103, "shay", "dev");
		Employee emp4=new Employee(104, "akshra", "tester");
		
		
		  List<Employee> list=Arrays.asList(emp1,emp2,emp3,emp4);
		  
		 Predicate<Employee> p1=e->e.ename.equals("ak");
		 Predicate<Employee> p2=e->e.job.equals("dev");
		 
		 //Predicate<Employee>p=p1.and(p2);
		 Predicate<Employee>p=p1.or(p2);
		 
		 for(Employee emp:list) {
			 if(p.test(emp))
				 System.out.println(emp.ename);
		 }
		 
	}

}
