package com.weian.Console;

import com.weian.Constant.Constant;
import com.weian.entity.Course;

public class CourseDemo {
	
	public static void b() {
		System.out.println("************************请选择要操作的信息对应数字************************");
		System.out.println("*1.查看学生课程   2.添加课程   3.删除课程   4.修改课程   5.给学生添加一门课程   6.给学生删除一门课程   7.返回\t *");
		System.out.println("**************************************************************************");
		System.out.print("请选择:");
		String a = Welcome.s1.next();
		switch (a) {
		case "1":
			Constant.COU.allCourse();
			b();
			break;
		case "2":
			System.out.print("请输入课程号:");
			int ca = Welcome.s1.nextInt();
			System.out.println("请输入课程名:");
			String cs = Welcome.s1.next();
			Course course = new Course(ca,cs);
			Constant.COU.addCourse(course);
			b();
			break;
		case "3":
			System.out.print("请输入课程号:");
			int id = Welcome.s1.nextInt();
			Constant.COU.deleteCourse(id);
			b();
			break;
		case "4":
			System.out.println("请输入要修改的课程号");
			int q = Welcome.s1.nextInt();
			System.out.println("请输入课程名:");
			String qw = Welcome.s1.next();
			Course c = new Course(q, qw);
			Constant.COU.updateCourse(c);
			b();
			break;
		case "5":
			System.out.println("请输入要添加的学生号");
			String sid = Welcome.s1.next();
			System.out.println("请输入要添加的课程号");
			int cid = Welcome.s1.nextInt();
			Constant.SAD.addStuCourse(sid, cid);
			b();
			break;
		case "6":
			System.out.println("请输入要删除的学生号");
			String did = Welcome.s1.next();
			System.out.println("请输入要删除的课程号");
			int dcid = Welcome.s1.nextInt();
			Constant.SAD.deleteStuCourse(did, dcid);
			b();
			break;
		case "7":
			Manager.a();
			break;
		default:
			System.out.println("输入错误");
			b();
			break;
		}
	}
	
}
