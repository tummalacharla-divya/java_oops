package com.divya.Properties.Inheritance;

public class Main {
	public static void main(String[] args) {
//		Box box=new Box(4,8,5);
//		Box box2=new Box(box);
//		System.out.println(box.w+" "+box.h);
		
		//System.out.println(box.weight+" "+box.h);//object is created for parent so child properties does not access
//		BoxWeight box3=new BoxWeight();
//		BoxWeight box4=new BoxWeight(9,5,7,3);
//		System.out.println(box3.h+" "+box3.weight);
		
//		Box box5=new BoxWeight(6,8,4,9);
//		System.out.println(box5.weight);
		
//		BoxWeight box6=new Box(8,9,5);it is not possible
		//System.out.println(box6.weight);
		BoxPrice box=new BoxPrice(7,7,8000);
		BoxWeight box3=new BoxWeight();
		box3.greetings();
	}

}
