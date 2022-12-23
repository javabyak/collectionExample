package com.ak.collection;

public class Student {
    private int sno;
    private String sname;
    
    public Student(int sno,String sname) {
		this.sno=sno;
		this.sname=sname;
	}
    
    public String toString() {
    	return sno+"....."+sname;
    }
}
