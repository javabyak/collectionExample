package com.nt.comparator;

public class Student {
	
	 int sno;
	 String name;
	 Double fees;

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getFees() {
		return fees;
	}

	public void setFees(Double fees) {
		this.fees = fees;
	}

	public Student(int sno, String name, Double fees) {
		super();
		this.sno = sno;
		this.name = name;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", fees=" + fees + "]";
	}

}
