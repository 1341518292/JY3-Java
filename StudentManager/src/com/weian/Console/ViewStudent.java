package com.weian.Console;


import java.util.List;

import com.weian.Constant.Constant;
import com.weian.entity.Student;

public class ViewStudent {
	public static void getViem() {
		

		System.out.println("**************************************************************************");
		System.out.println("* 1.�鿴����ѧ����Ϣ   2.����id��ѯѧ����Ϣ   3.����id��ѯѧ������   4.ͨ��ѧ����������ѧ��ѡ�����  5.ͨ���γ̺Ų���ѧ����Ϣ   6.������һ��");
		System.out.println("**************************************************************************");
		System.out.print("��ѡ��:");
		String a = Welcome.s1.next();
		switch (a) {
		case "1":
			List<Student> allStu = Constant.STU.AllStu();
			for (Student student : allStu) {
				System.out.println(student);
			}
			getViem();
			break;
		case "2":
			System.out.print("������Ҫ��ѯ��id:");
			String b = Welcome.s1.next();
			Student oneStu = Constant.STU.OneStu(b);
			if(oneStu.getStuName() != null) {
				System.out.println(oneStu);
			}else {
				System.out.println("û���ҵ���id");
			}
			getViem();
			break;
		case "3":
			System.out.print("������Ҫ��ѯ��id:");
			String c = Welcome.s1.next();
			Student name = Constant.STU.OneStu(c);
			if(name.getStuName() != null) {
				System.out.println(name.getStuName());
			}else {
				System.out.println("û���ҵ���id");
			}	
			getViem();
			break;
		case "4":
			System.out.print("������Ҫ��ѯ��id:");
			String z = Welcome.s1.next();
			List<String> course = Constant.STU.getCourse(z);
			if(!course.isEmpty()) {
				for (String string : course) {
					System.out.println(string);
				}
			}else {
				System.out.println("û���ҵ���id");
			}	
			getViem();
			break;
		case "5":
			System.out.print("������Ҫ��ѯ�Ŀγ̺�(1-7):");
			int qwe = Welcome.s1.nextInt();
			List<Student> stu = Constant.STU.getStu(qwe);
			if(!stu.isEmpty()) {
				for (Student student : stu) {
					System.out.println(student);
				}
			}else {
				System.out.println("û���ҵ�ѡ��˿γ̵�ѧ��");
			}	
			getViem();
			break;
		case "6":
			Contents.getContents();
			break;
		default:
			System.out.println("��������ȷ��ֵ");
			ViewStudent.getViem();
			break;
		}
	}
}
