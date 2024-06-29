package com.divya;

//class is logical construct
//object is physical reality (occupy some space in memory)
//it is 3 types: State of the object (value passed to ), identity of the object, behavior of the object.
public class Classes_objects {

	public static void main(String[] args) {
		//store 5 roll nos
		int[] numbers=new int[5];
		//store 5 names
		String[] names=new String[5];
		//data of 5 students: (roll no,name,marks)
		int[] rno=new int[5];
		String[] name=new String[5];
		float[] marks=new float[5];
		
		//new - dynamically allocate memory and returns a reference to it.
		Student[] students=new Student[5];
		//Student divya;
		//divya= new Student();
		Student s=new Student();
		Student divya=new Student(78,"divya",89.0f);
//		divya.rno=67;
//		divya.name="divya";
//		divya.marks=90.0f;
		divya.changeName("div");
		divya.greeting();
//		System.out.println(divya.rno);
//		System.out.println(divya.name);
//		System.out.println(divya.marks);
		
		System.out.println(s.rno);
		System.out.println(s.name);
		System.out.println(s.marks);
		
		Student other=new Student(divya);
		System.out.println(other.name);
		Student random2=new Student();
		System.out.println(random2.name);
		
		Student one=new Student();
		Student two=one;
		one.name="something";
		System.out.println(two.name);
//		System.out.println(Arrays.toString(students));
	}

}
class Student{
	int rno;
	static String name;
	float marks;
//	Student(){
//		this.rno=67;
//		this.name="dguu";
//		this.marks=67.f;
//	}
	Student(){
		//this is how you call a constructor from another constructor.
		//internally : new Student();
		this(13,"vnk",67.9f);
	}
	Student(int rno,String name,float marks){
		this.rno=rno;
		this.name=name;
		this.marks=marks;
	}
	Student(Student other){
		this.name=other.name;
		this.rno=other.rno;
		this.marks=other.marks;
	}
	void changeName(String newname) {
		name=newname;
	}
	void greeting() {
		//System.out.println("hello! "+this.name);
		System.out.println("hello! "+name);
	}
}

