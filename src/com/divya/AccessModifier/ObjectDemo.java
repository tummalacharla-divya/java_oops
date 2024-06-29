package com.divya.AccessModifier;

public class ObjectDemo {
	int num;
	int name;
	public ObjectDemo(int num,int name) {
		this.num=num;
		this.name=name;
	}
	public ObjectDemo() {
		super();
	}
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public int hashCode() {
		//return super.hashCode();
		return num;
	}
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		return this.num==((ObjectDemo)obj).num;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	@Override
	protected void finalize() throws Throwable{//for garbage collection
		super.finalize();
	}
	public static void main(String[] args) {
		ObjectDemo obj=new ObjectDemo(23,89);
		ObjectDemo obj2=new ObjectDemo(23,67);
		ObjectDemo obj3=obj;//same hashcode is assigned to obj3
		//System.out.println(obj.hashCode());
//		System.out.println(obj2.hashCode());
//		if(obj<obj2) {
//		if(obj==obj2) {
		if(obj.equals(obj2)) {
			System.out.println("obj is equal to obj2");
		}
		System.out.println(obj.getClass().getName());
	}
	
}
