package com.day2.encapsulation;

public class Student2 {

	public static void main(String[] args) {
		Student std=new Student();
		System.out.println(std);
	std.name="suresh";
	std.age=21;
	std.regno=80;
	std.per=90.0f;
	System.out.println(std);
	System.out.println(std.getName());
	System.out.println(std.getAge());
	System.out.println(std.getRegno());
	System.out.println(std.getPer());
	}

}
