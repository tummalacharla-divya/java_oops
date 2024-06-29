package com.divya.Properties.Polymorphism;

public class ObjectPrint {
	int num;
	public ObjectPrint(int num) {
		this.num=num;
	}
	@Override
	public String toString() {
		return "onjrctPrint{"+"num="+num+'}';
	}
	public static void main(String[] args) {
		ObjectPrint obj=new ObjectPrint(89);
		System.out.println(obj);
	}
}
