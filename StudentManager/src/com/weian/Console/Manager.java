package com.weian.Console;

public class Manager {
	public static void a() {
		System.out.println("1.ѧ������ϵͳ \t 2.�γ̹���ϵͳ");
		System.out.print("��ѡ��:");
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
			System.out.println("�������");
			a();
		}
	}
}
