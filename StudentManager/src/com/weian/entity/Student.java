package com.weian.entity;

import java.util.Scanner;

import com.weian.Console.Welcome;

/**
 * ѧ�����ʵ��
 * @author Weian
 */
public class Student {
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(String stuID, String stuName, Integer stuAge, String stuSex) {
		super();
		this.stuID = stuID;
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuSex = stuSex;
	}

	private String stuID;
	private String stuName;
	private Integer stuAge;
	private String stuSex;
	public String getStuID() {
		return stuID;
	}

	public void setStuID(String stuID) {
		this.stuID = stuID;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Integer getStuAge() {
		return stuAge;
	}

	public void setStuAge(Integer stuAge) {
		this.stuAge = stuAge;
	}

	public String getStuSex() {
		return stuSex;
	}

	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}

	@Override
	public String toString() {
		return "Student [stuID=" + stuID + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuSex=" + stuSex + "]";
	}
	
	public static Student setStu() {
		
		System.out.println("*******************************���ѧ����Ϣ*******************************");
		System.out.print("������ѧ��id:");
		String id = Welcome.s1.next();	
		System.out.print("������ѧ������:");	
		String name = Welcome.s1.next();
		int age = 0;
		String sex = null;
		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("������ѧ������(int):");
			if (s1.hasNextInt()) {
				 age = s1.nextInt();
				if(age<=120 && age>=1) {
					
					break;
				}else {
					System.out.println("������1-120֮�������");
				}
			} else {
				System.out.println("�����������������");
			}
		}
		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("������ѧ���Ա�(��/Ů):");
			sex = s1.next();
			if ( sex.length()==1 && sex.charAt(0) == '��' || sex.charAt(0) == 'Ů' ) {
				
				break;
			} else {
				System.out.println("�����������������");
			}
		}
		return new Student(id, name, age, sex);
	}
}
