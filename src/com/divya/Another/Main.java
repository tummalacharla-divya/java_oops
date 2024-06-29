package com.divya.Another;

public class Main {
	public static void main(String[] args) {
		Human divya=new Human(22,"divya",1000000,false);
		Human div=new Human(27,"div",1000000,true);
//		System.out.println(divya.population);
//		System.out.println(div.population);
		System.out.println(Human.population);// both the conventions are true but this is the correct way
		System.out.println(Human.population);
		//greet();//only static methods are accessible with in static methods (in this case main method)
//		Main fun=new Main();
//		fun.fun2();
	}
	static void fun() {
		Main obj=new Main();
		obj.greet();
		//greet();//you cant use this becuase it requires an instance
		//but the function you are using it in does not depend on instance
	}
	void fun2() {
		greet();
	}
	//we know that somethingwhich is not static, belongs to an object
	//this is depend on object
	void greet() {
		fun(); //it is possible
		System.out.println("hello");
	}
}
