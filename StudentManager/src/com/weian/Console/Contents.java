package com.weian.Console;

import com.weian.Constant.Constant;
import com.weian.entity.Student;

public class Contents {
	public static void getContents() {

		System.out.println("************************��ѡ��Ҫ��������Ϣ��Ӧ����************************");
		System.out.println("*1.�鿴ѧ����Ϣ\t 2.���ѧ����Ϣ\t 3.ɾ��ѧ����Ϣ\t 4.�޸�ѧ����Ϣ\t 5.������һ��\t 6.�˳�*");
		System.out.println("**************************************************************************");
		System.out.print("��ѡ��:");
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
			System.out.println("������Ҫɾ����ID");
			String id = Welcome.s1.next();
			Student oneStu = Constant.STU.OneStu(id);
			if(oneStu.getStuName() != null) {
				Constant.STU.deleteStu(id);
				getContents();
			}else {
				System.out.println("û�д�id");
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
			System.out.println("��Ե�ټ�");
			System.exit(0);
		default:
			System.out.println("��������ȷ������");
			Contents.getContents();
			break;
		}


	}
}
