package com.divya;

public class Wrapper_example {

	public static void main(String[] args) {
		final int increase=2;// in this case can not change the value in premitive data type.
		
		int a=10;
		int b=20;
		//Integer num=45;
		swap(a,b);
		//Integer,int are a final function so its not swapped. beacause the function returns values. but reference variable immutable if the data type of variable
		//is int
		System.out.println(a+" "+b);
		final A k=new A("divya");
		k.name="other";
		System.out.println(k.name);
		//when a non primitive is final, you cannot reassign it.
		//k=new A("other");
		A obj=new A("divya");
		System.out.println(obj);
		
//		for(int i=1;i<1000000000;i++) {
//			obj=new A("random");
//		}
		Classes_objects o=new Classes_objects();
		System.out.println(Student.name);
	}
	public static void swap(int a,int b) {
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a+" "+b);
		
	}
}
class A{
	final int num=10;
	String name;
	
	public A(String name) {
		this.name=name;
	}
	protected void finalize() throws Throwable{
		System.out.println("object is destoryed");
	}
}
