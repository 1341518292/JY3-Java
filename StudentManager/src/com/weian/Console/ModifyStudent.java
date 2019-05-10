package com.weian.Console;

import com.weian.Constant.Constant;
import com.weian.entity.Student;

public class ModifyStudent {
	public static void setStudent() {

		System.out.println("**************************************************************************");
		System.out.println("1.根据id修改学生全部信息        2.根据id修改学生部分信息         3.返回上级         4.系统退出");
		System.out.println("**************************************************************************");
		System.out.print("请选择:");
		String a = Welcome.s1.next();
		switch (a) {
		case "1":
			System.out.println("请输入要修改的id");
			String id = Welcome.s1.next();
			System.out.println("请输入修改后的名字");
			String name = Welcome.s1.next();
			System.out.println("请输入修改后的年龄");
			Integer age = Welcome.s1.nextInt();
			System.out.println("请输入修改后的性别");
			String sex = Welcome.s1.next();
			Student oneStu = Constant.STU.OneStu(id);
			if(oneStu.getStuName() != null) {
				Student student2 = new Student(id, name, age, sex);
				Constant.STU.updateStu(student2);
			}else {
				System.out.println("请输入正确的id");
			}
			setStudent();
			break;
		case "2":
			System.out.println("请输入要修改的id");
			String sid = Welcome.s1.next();
			System.out.println("请输入修改后的名字");
			String sname = Welcome.s1.next();
			Student soneStu = Constant.STU.OneStu(sid);
			if(soneStu.getStuName() != null) {
				Student student2 = new Student();
				student2.setStuName(sname);
				student2.setStuID(sid);
				Constant.STU.updateStu(student2);
			}else {
				System.out.println("请输入正确的id");
			}
			setStudent();
			break;
		case "3":
			Contents.getContents();
			break;
		case "4":
			System.out.println("有缘再见");
			System.exit(0);
			break;
		default:
			System.out.println("请重新输入");
			setStudent();
			break;
		}
	}
}
