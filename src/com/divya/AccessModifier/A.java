package com.divya.AccessModifier;

public class A {
	private int num;//basically int num is a private if it is declared as public it can be accessible any where
	int n;
	String name;
	int[] arr;
	public int getNum() {
		return num;
	}
	public int setNum(int num) {
		return num;
	}
	public A(int num,String name) {
		this.num=num;
		this.name=name;
		this.arr=new int[num];
	}
}
