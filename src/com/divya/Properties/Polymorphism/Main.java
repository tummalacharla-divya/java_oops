package com.divya.Properties.Polymorphism;

public class Main {

	public static void main(String[] args) {
		Shapes shape=new Shapes();
		Circle circle=new Circle();
		Square square=new Square();//up-casting, dynamic method dispatch
		Shapes square1=new Square();
		circle.area();
		square.area();
		square1.area();
	}

}
