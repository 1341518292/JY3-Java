package com.weian.Console;

import com.weian.Constant.Constant;
import com.weian.entity.Course;

public class CourseDemo {
	
	public static void b() {
		System.out.println("************************��ѡ��Ҫ��������Ϣ��Ӧ����************************");
		System.out.println("*1.�鿴ѧ���γ�   2.��ӿγ�   3.ɾ���γ�   4.�޸Ŀγ�   5.��ѧ�����һ�ſγ�   6.��ѧ��ɾ��һ�ſγ�   7.����\t *");
		System.out.println("**************************************************************************");
		System.out.print("��ѡ��:");
		String a = Welcome.s1.next();
		switch (a) {
		case "1":
			Constant.COU.allCourse();
			b();
			break;
		case "2":
			System.out.print("������γ̺�:");
			int ca = Welcome.s1.nextInt();
			System.out.println("������γ���:");
			String cs = Welcome.s1.next();
			Course course = new Course(ca,cs);
			Constant.COU.addCourse(course);
			b();
			break;
		case "3":
			System.out.print("������γ̺�:");
			int id = Welcome.s1.nextInt();
			Constant.COU.deleteCourse(id);
			b();
			break;
		case "4":
			System.out.println("������Ҫ�޸ĵĿγ̺�");
			int q = Welcome.s1.nextInt();
			System.out.println("������γ���:");
			String qw = Welcome.s1.next();
			Course c = new Course(q, qw);
			Constant.COU.updateCourse(c);
			b();
			break;
		case "5":
			System.out.println("������Ҫ��ӵ�ѧ����");
			String sid = Welcome.s1.next();
			System.out.println("������Ҫ��ӵĿγ̺�");
			int cid = Welcome.s1.nextInt();
			Constant.SAD.addStuCourse(sid, cid);
			b();
			break;
		case "6":
			System.out.println("������Ҫɾ����ѧ����");
			String did = Welcome.s1.next();
			System.out.println("������Ҫɾ���Ŀγ̺�");
			int dcid = Welcome.s1.nextInt();
			Constant.SAD.deleteStuCourse(did, dcid);
			b();
			break;
		case "7":
			Manager.a();
			break;
		default:
			System.out.println("�������");
			b();
			break;
		}
	}
	
}
