package com.Weian.classwork;

import java.util.Scanner;

public class UserTest {
	public static void main(String[] args) {
		UserClass u1 = new UserClass();
		Scanner s1 = new Scanner(System.in);
		//输入用户名
		System.out.println("请输入用户名");
		String username = s1.next();
		//输入密码
		System.out.println("请输入密码");
		String password = s1.next();
		boolean a1 = u1.checkUser(username, password);
		System.out.println(a1?"登陆成功":"登录失败");
		s1.close();
	}
}
