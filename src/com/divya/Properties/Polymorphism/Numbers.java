package com.divya.Properties.Polymorphism;
//runtime/dynamic polymorphism is achieved by method overriding
public class Numbers {
	//sum is over loaded
	int sum(int a,int b) {
		return a+b;
	}
	double sum(double a,int b) {
		return a+b;
	}
	int sum(int a,int b,int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		Numbers obj=new Numbers();
		obj.sum(7, 9);
		obj.sum(30, 6,5);
	}
}
