package com.divya.ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		int a=6;
		int b=0;
		try {
			//int c=a/b;
			//divide(a,b);
			String name="divya";
			if(name.equals("divya")) {
				throw new MyException("name is divya"); 
			}
			//throw new ArithmeticException("just for fun"); 
		}
		catch (MyException e){
			System.out.println(e.getMessage());
		}
		catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch (Exception e){
			System.out.println("normal exception");
		}finally {
			System.out.println("this will always execute");
		}
	}

	static int divide(int a, int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException("do not divide by zero");
		}
		return a/b;
	}

}
