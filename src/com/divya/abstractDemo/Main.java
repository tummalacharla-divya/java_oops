package com.divya.abstractDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son son=new Son(7);
		son.career();
		Daughter d=new Daughter(6);
		d.career();
		//Parent p=new Parent();//you can't create parent of abstract class. but it is possible to implement methods here
		Parent.hello();
		son.normal();
	}

}
