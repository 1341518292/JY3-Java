package com.weian.Console;

public class Manager {
	public static void a() {
		System.out.println("1.学生管理系统 \t 2.课程管理系统");
		System.out.print("请选择:");
		String next = Welcome.s1.next();
		switch(next) 
		{
		case "1":
			Contents.getContents();
			break;
		case "2":
			
			CourseDemo.b();
			break;
		default:
			System.out.println("输入错误");
			a();
		}
	}
}
