package com.Weian.classwork;

import java.util.Scanner;

public class UserTest {
	public static void main(String[] args) {
		UserClass u1 = new UserClass();
		Scanner s1 = new Scanner(System.in);
		//�����û���
		System.out.println("�������û���");
		String username = s1.next();
		//��������
		System.out.println("����������");
		String password = s1.next();
		boolean a1 = u1.checkUser(username, password);
		System.out.println(a1?"��½�ɹ�":"��¼ʧ��");
		s1.close();
	}
}
