package com.weian.Console;

import com.weian.Constant.Constant;
import com.weian.entity.Student;

public class ModifyStudent {
	public static void setStudent() {

		System.out.println("**************************************************************************");
		System.out.println("1.����id�޸�ѧ��ȫ����Ϣ        2.����id�޸�ѧ��������Ϣ         3.�����ϼ�         4.ϵͳ�˳�");
		System.out.println("**************************************************************************");
		System.out.print("��ѡ��:");
		String a = Welcome.s1.next();
		switch (a) {
		case "1":
			System.out.println("������Ҫ�޸ĵ�id");
			String id = Welcome.s1.next();
			System.out.println("�������޸ĺ������");
			String name = Welcome.s1.next();
			System.out.println("�������޸ĺ������");
			Integer age = Welcome.s1.nextInt();
			System.out.println("�������޸ĺ���Ա�");
			String sex = Welcome.s1.next();
			Student oneStu = Constant.STU.OneStu(id);
			if(oneStu.getStuName() != null) {
				Student student2 = new Student(id, name, age, sex);
				Constant.STU.updateStu(student2);
			}else {
				System.out.println("��������ȷ��id");
			}
			setStudent();
			break;
		case "2":
			System.out.println("������Ҫ�޸ĵ�id");
			String sid = Welcome.s1.next();
			System.out.println("�������޸ĺ������");
			String sname = Welcome.s1.next();
			Student soneStu = Constant.STU.OneStu(sid);
			if(soneStu.getStuName() != null) {
				Student student2 = new Student();
				student2.setStuName(sname);
				student2.setStuID(sid);
				Constant.STU.updateStu(student2);
			}else {
				System.out.println("��������ȷ��id");
			}
			setStudent();
			break;
		case "3":
			Contents.getContents();
			break;
		case "4":
			System.out.println("��Ե�ټ�");
			System.exit(0);
			break;
		default:
			System.out.println("����������");
			setStudent();
			break;
		}
	}
}
