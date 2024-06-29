package com.divya.Interfaces.NestedInterfaces;

public class A {
	public interface Nested{
		boolean isOdd(int num);
	}
}
class B implements A.Nested{

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		return ((num&1)==1);
	}
	
}
