package com.divya.Another;

public class Human {

		int age;
		String name;
		int salary;
		boolean married;
		static long population;
		static void message() {
			System.out.println("hello");
			
		}
		public Human(int age, String name,int salary,boolean married) {
			this.age=age;
			this.name=name;
			this.salary=salary;
			this.married=married;
			this.population+=1;
			//Human.population+=1; // if the variable is static type then we directly call using class name.
			//this.message();
			Human.message();
		}
}
