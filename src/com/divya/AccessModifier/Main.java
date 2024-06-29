package com.divya.AccessModifier;

public class Main {

	public static void main(String[] args) {
		A obj=new A(6,"divya");
		//obj.num;
		obj.getNum();
		//obj.n;//becuase n is by default private
		int a=obj.n;
		System.out.println(obj instanceof A);
	}

}


//			class|package|subclass(same package)|subclass(diff Pkg)|world(diff pkg&not sub class)
//public	+	| +		 |    +					|      +			|       +
//protected +	| +		 |    +					|      +
//no modifier + | +		 |    +
//private   +	|


//packages 1)build-in packages(util(data structures, collections),lang,io,applet,awt,.net etc)  2)user defined




