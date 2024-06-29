package com.divya.Another;
//this is a demo to show initialisation of static variables
public class StaticBlock {
	static int a=4;
	static int b;
	
	static{ // it loads exactly ones when class is loaded
		System.out.println("i am static");
		b=a+5;//static variables can be initialised using static block
	}
	public static void main(String[] args) {
		StaticBlock obj=new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		StaticBlock.b+=3;
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
		StaticBlock obj2=new StaticBlock();
		System.out.println(StaticBlock.a+" "+StaticBlock.b);
	}
}
