package com.weian.Console;

import java.util.Scanner;

public class Welcome {
	public static Scanner s1 = new Scanner(System.in);
	public static void welcomeDemo() {
		
		System.out.println("----------------��ӭ��¼ѧ������ϵͳ----------------");
		System.out.println("1.��¼ \t 2.�˳�");
		System.out.println("----------------------------------------------------");
		System.out.print("��ѡ��:");
		String x = s1.next();
			switch (x) {
			case "1":
				System.out.println("��ӭ��¼��");
				Username.Login();		
				break;
			case "2":
				System.out.println("��Ե�ټ���");
				System.exit(0);
				break;
			default:
				System.out.println("�������������ѡ��");
				Welcome.welcomeDemo();
				break;
			}	
	}
}
