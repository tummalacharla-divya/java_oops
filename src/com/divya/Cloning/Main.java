package com.divya.Cloning;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {
		Human divya=new Human(34,"divya");
		//Human twin=new Human(divya);
		Human twin=(Human)divya.clone();
		System.out.println(twin.age+ " "+twin.name);
		System.out.println(Arrays.toString(twin.arr));
		twin.arr[0]=100;
		//this is shallow copy : reflected to divya object
		System.out.println(Arrays.toString(divya.arr));
		System.out.println(Arrays.toString(twin.arr));
	}

}
//deep copy: not reflected to other object
