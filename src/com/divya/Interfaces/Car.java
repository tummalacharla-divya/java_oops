package com.divya.Interfaces;

public class Car implements Engine,Brake,Media{

	@Override
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("i brake");
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("i start");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("i stop");
	}

	@Override
	public void acc() {
		// TODO Auto-generated method stub
		System.out.println("i accelerate");
	}

}
