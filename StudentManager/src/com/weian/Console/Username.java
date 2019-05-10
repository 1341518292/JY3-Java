package com.weian.Console;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.weian.Constant.Constant;
import com.weian.entity.User;


public class Username {


	public static void Login() {
		//查找user表
		String sql = "SElECT username,password FROM user";
		List<User> list = new ArrayList<>();
		try(
				PreparedStatement prepareStatement = Constant.CONN.prepareStatement(sql);
				ResultSet rs = prepareStatement.executeQuery();
				) {
			while(rs.next()) {
				User user = new User();
				user.setUsername(rs.getString(1));
				user.setPassword(rs.getString(2));
				list.add(user);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//创建对象
		System.out.print("请输入用户名:");
		String name = Welcome.s1.next();
		System.out.print("请输入密码:");
		String psw = Welcome.s1.next();
		User u = new User(name, psw);
		
		//比较
		boolean b = false;
		for (User user : list) {
			b = user.equals(u);
			if(b) {
				break;
			}
		}
		if(b) {
			System.out.println("登录成功");
			System.out.println("欢迎回来，admin");
			Manager.a();
		}else {
			System.out.println("账户或密码错误");
			Welcome.welcomeDemo();	
		}			
	}
}
