package com.divya.generics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student divya=new Student(56,989.7f);
		Student div=new Student(5,789.7f);
		Student div1=new Student(7,789.7f);
		Student div2=new Student(34,789.7f);
		
		Student[] list= {divya,div,div1,div2};
		
		System.out.println(Arrays.toString(list));
		Arrays.sort(list,new Comparator<Student>() {
			public int compare(Student o1,Student o2) {
				return (int)(o1.marks-o2.marks);
			}
		});
		System.out.println(Arrays.toString(list));
//		if(divya.compareTo(div)>0) {
//			System.out.println(divya.compareTo(div));
//			System.out.println("divyya has more marks");
//		}
	}

}
