package com.divya.abstractDemo;

public class Daughter extends Parent{

	public Daughter(int age) {
//		super(age);
		this.age=age;
	}
	@Override
	void career() {
		// TODO Auto-generated method stub
		System.out.println("i am Daughter of doctor");
	}

	@Override
	void partner() {
		// TODO Auto-generated method stub
		System.out.println("i am daughter");
	}

}
