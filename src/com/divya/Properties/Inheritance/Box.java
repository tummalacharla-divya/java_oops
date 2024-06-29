package com.divya.Properties.Inheritance;
//static methods can be inherited but can not be overriden
//override depends on objects and static methods dos not depend on objects. hence can not override static methods
//override and over loding does not applicable to instance variables (declared with in class but out side methods,
//constructors, etc. but it can be accessed by all these with help of object
//object class is by default inherited. object class is base class

public class Box {
	double l;
	double h;
	double w;
	double weight;
	static void greetings() {
		System.out.println("hey , hi");
	}
	Box(){
		this.h=-1;
		this.l=-1;
		this.w=-1;
	}
	//cube
	Box(double side){
		//super(); object class
		this.h=side;
		this.l=side;
		this.w=side;
	}
	
	Box(double l,double h,double w){
		System.out.println("box class constructor");
		this.h=h;
		this.l=l;
		this.w=w;
	}
	
	Box(Box old){
		this.h=old.h;
		this.l=old.l;
		this.w=old.w;
	}
	public void information() {
		System.out.println("running the box");
	}
}
