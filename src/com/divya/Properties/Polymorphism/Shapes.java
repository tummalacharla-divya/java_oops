package com.divya.Properties.Polymorphism;

public class Shapes {
	void area() {//it is late binding
		System.out.println("I am in shapes");
	}
//	final void area() {//final methods are not overriden. it is early binding
//		System.out.println("I am in shapes");
//	}
}
