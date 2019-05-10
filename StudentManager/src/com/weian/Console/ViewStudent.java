package com.weian.Console;


import java.util.List;

import com.weian.Constant.Constant;
import com.weian.entity.Student;

public class ViewStudent {
	public static void getViem() {
		

		System.out.println("**************************************************************************");
		System.out.println("* 1.查看所有学生信息   2.根据id查询学生信息   3.根据id查询学生姓名   4.通过学生号来查找学生选课情况  5.通过课程号查找学生信息   6.返回上一层");
		System.out.println("**************************************************************************");
		System.out.print("请选择:");
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
			System.out.print("请输入要查询的id:");
			String b = Welcome.s1.next();
			Student oneStu = Constant.STU.OneStu(b);
			if(oneStu.getStuName() != null) {
				System.out.println(oneStu);
			}else {
				System.out.println("没有找到此id");
			}
			getViem();
			break;
		case "3":
			System.out.print("请输入要查询的id:");
			String c = Welcome.s1.next();
			Student name = Constant.STU.OneStu(c);
			if(name.getStuName() != null) {
				System.out.println(name.getStuName());
			}else {
				System.out.println("没有找到此id");
			}	
			getViem();
			break;
		case "4":
			System.out.print("请输入要查询的id:");
			String z = Welcome.s1.next();
			List<String> course = Constant.STU.getCourse(z);
			if(!course.isEmpty()) {
				for (String string : course) {
					System.out.println(string);
				}
			}else {
				System.out.println("没有找到此id");
			}	
			getViem();
			break;
		case "5":
			System.out.print("请输入要查询的课程号(1-7):");
			int qwe = Welcome.s1.nextInt();
			List<Student> stu = Constant.STU.getStu(qwe);
			if(!stu.isEmpty()) {
				for (Student student : stu) {
					System.out.println(student);
				}
			}else {
				System.out.println("没有找到选择此课程的学生");
			}	
			getViem();
			break;
		case "6":
			Contents.getContents();
			break;
		default:
			System.out.println("请输入正确的值");
			ViewStudent.getViem();
			break;
		}
	}
}
