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
		//����user��
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
		//��������
		System.out.print("�������û���:");
		String name = Welcome.s1.next();
		System.out.print("����������:");
		String psw = Welcome.s1.next();
		User u = new User(name, psw);
		
		//�Ƚ�
		boolean b = false;
		for (User user : list) {
			b = user.equals(u);
			if(b) {
				break;
			}
		}
		if(b) {
			System.out.println("��¼�ɹ�");
			System.out.println("��ӭ������admin");
			Manager.a();
		}else {
			System.out.println("�˻����������");
			Welcome.welcomeDemo();	
		}			
	}
}
