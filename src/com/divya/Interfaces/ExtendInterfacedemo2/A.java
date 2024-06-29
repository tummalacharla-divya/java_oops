package com.divya.Interfaces.ExtendInterfacedemo2;

public interface A {
	//static interface methods should have a body
	//call via the interface name
	static void greeting() {
		System.out.println("i am static");
	}
	default void fun() {
		System.out.println("i am in A");
	}
	
}
