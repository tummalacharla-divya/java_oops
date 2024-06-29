package com.divya.generics.Comparing;

public class Student{
	int rollno;
	float marks;
	public Student(int rollno,float marks) {
		// TODO Auto-generated constructor stub
		this.rollno=rollno;
		this.marks=marks;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return rollno+"";
	}
	//@Override
//	public int compareTo(Student o) {
//		// TODO Auto-generated method stub
//		int diff=(int)(this.marks-o.marks);
//		return diff;
//	}
}
