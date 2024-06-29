package com.divya.abstractDemo;

public class Son extends Parent{

	public Son(int age) {
		//super(age);
		this.age=age;
	}
	@Override
	void normal() {
		
	}
	@Override
	void career() {
		// TODO Auto-generated method stub
		System.out.println("i am son of doctor");
	}

	@Override
	void partner() {
		// TODO Auto-generated method stub
		System.out.println("i am partner");
	}

}
