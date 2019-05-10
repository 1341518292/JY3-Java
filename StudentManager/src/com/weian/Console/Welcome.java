package com.weian.Console;

import java.util.Scanner;

public class Welcome {
	public static Scanner s1 = new Scanner(System.in);
	public static void welcomeDemo() {
		
		System.out.println("----------------欢迎登录学生管理系统----------------");
		System.out.println("1.登录 \t 2.退出");
		System.out.println("----------------------------------------------------");
		System.out.print("请选择:");
		String x = s1.next();
			switch (x) {
			case "1":
				System.out.println("欢迎登录！");
				Username.Login();		
				break;
			case "2":
				System.out.println("有缘再见！");
				System.exit(0);
				break;
			default:
				System.out.println("输入错误，请重新选择");
				Welcome.welcomeDemo();
				break;
			}	
	}
}
