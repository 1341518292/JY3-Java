package com.Weian.Test02;

public class StudentDemo {
	public static void main(String[] args) {
		Student st1 = new Student("zhangsan", 175, 60);
		Student st2 = new Student("lisi", 186, 75);
		st1.sayHello();
		st2.sayHello();
	}
}
class Student{
	String name;
	int height;
	int weight;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(String name,int height,int weight) {
		this.name= name;
		this.height =height;
		this.weight =weight;
	}
	public void sayHello() {
		System.out.println("Hello, my name is "+name);
	}
}