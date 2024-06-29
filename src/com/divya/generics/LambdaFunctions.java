package com.divya.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		for(int i=0;i<5;i++) {
			arr.add(i+1);
		}
		arr.forEach((item)->System.out.println(item+2));
		Consumer<Integer> fun=(item)-> System.out.println(item+2);
		arr.forEach(fun);
		Sum sum=(a,b)->a+b;
		Sum prod=(a,b)->a*b;
		Sum sub=(a,b)->a-b;
		LambdaFunctions mycalculator=new LambdaFunctions();
		System.out.println(mycalculator.Operate(8, 6, sum));
		System.out.println(mycalculator.Operate(8, 6, prod));
		System.out.println(mycalculator.Operate(8, 6, sub));
	}
	private int Operate(int a,int b,Sum op) {
		return op.sum(a, b);
	}

}
interface Sum{
	int sum(int a,int b);
}