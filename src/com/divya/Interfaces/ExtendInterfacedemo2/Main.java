package com.divya.Interfaces.ExtendInterfacedemo2;
//Interface to interface use extends keyword
//class to interface use implements keyword
public class Main implements A,B{


	@Override
	public void greet() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		Main obj=new Main();
		A.greeting();
	}

	

}
