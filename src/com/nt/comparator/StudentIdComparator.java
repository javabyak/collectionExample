package com.nt.comparator;

import java.util.Comparator;

public class StudentIdComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		return s1.sno-s2.sno;
	}

}
