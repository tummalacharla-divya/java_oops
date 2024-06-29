package com.divya.Another;
class Test{
	String name;
	public Test(String name) {
		this.name=name;
	}
	
}
//both the classes Test gave same outputs.
public class InnerClasses { //outside class can not be static
	static class Test{// this class is depend on innerclass so it must be a static class
		String name;
		public Test(String name) {
			this.name=name;
		}
		
		@Override
		public String toString() {
			return name;
		}
	}
	public static void main(String[] args) {
		Test a=new Test("divya");
		Test b=new Test("div");
		System.out.println(a);// without toString it gives some random value to be printed
		System.out.println(a.name);
		System.out.println(b.name);
	}
	
}
