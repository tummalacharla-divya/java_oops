package com.divya.abstractDemo;
// here also multiple inheritance is not allowed
public abstract class Parent {
	int age;
	//abstract Parent();//abstract constructors not possible
	abstract void career();
	abstract void partner();
	//final int value;
//	public Parent(int age) {
//		this.age=age;
//		value=7986554;
//	}
	static void hello() {
		System.out.println("hey");
	}
	void normal() {
		System.out.println("this is normal");
	}
	
}
