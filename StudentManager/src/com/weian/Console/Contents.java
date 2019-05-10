package com.weian.Console;

import com.weian.Constant.Constant;
import com.weian.entity.Student;

public class Contents {
	public static void getContents() {

		System.out.println("************************请选择要操作的信息对应数字************************");
		System.out.println("*1.查看学生信息\t 2.添加学生信息\t 3.删除学生信息\t 4.修改学生信息\t 5.返回上一层\t 6.退出*");
		System.out.println("**************************************************************************");
		System.out.print("请选择:");
		String a = Welcome.s1.next();
		switch (a) {
		case "1":
			ViewStudent.getViem();
			break;
		case "2":
			Constant.STU.addStu(Student.setStu());
			getContents();
			break;
		case "3":
			System.out.println("请输入要删除的ID");
			String id = Welcome.s1.next();
			Student oneStu = Constant.STU.OneStu(id);
			if(oneStu.getStuName() != null) {
				Constant.STU.deleteStu(id);
				getContents();
			}else {
				System.out.println("没有此id");
				getContents();
			}
			
			break;
		case "4":
			ModifyStudent.setStudent();
			getContents();	
			break;
		case "5":
			Manager.a();
			break;
		case "6":
			System.out.println("有缘再见");
			System.exit(0);
		default:
			System.out.println("请输入正确的数字");
			Contents.getContents();
			break;
		}


	}
}
