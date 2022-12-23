package com.nt.comparable;

public class Student implements Comparable<Student> {
    public int sno;
    public String name;
    public Double fees;
	
    
    
    public Student(int sno, String name, Double fees) {
		super();
		this.sno = sno;
		this.name = name;
		this.fees = fees;
	}
   
    @Override
	public int compareTo(Student st) {
		
		return this.sno-st.sno;
    	//return this.name.compareTo(st.name);
    	//return (int) (this.fees-st.fees);
	}


	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", fees=" + fees + "]";
	}

    
    
    
}
