package com.weian.entity;

import java.util.Scanner;

import com.weian.Console.Welcome;

/**
 * 学生表的实体
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
		
		System.out.println("*******************************添加学生信息*******************************");
		System.out.print("请输入学生id:");
		String id = Welcome.s1.next();	
		System.out.print("请输入学生名字:");	
		String name = Welcome.s1.next();
		int age = 0;
		String sex = null;
		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("请输入学生年龄(int):");
			if (s1.hasNextInt()) {
				 age = s1.nextInt();
				if(age<=120 && age>=1) {
					
					break;
				}else {
					System.out.println("请输入1-120之间的整数");
				}
			} else {
				System.out.println("输入错误，请输入数字");
			}
		}
		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("请输入学生性别(男/女):");
			sex = s1.next();
			if ( sex.length()==1 && sex.charAt(0) == '男' || sex.charAt(0) == '女' ) {
				
				break;
			} else {
				System.out.println("输入错误，请重新输入");
			}
		}
		return new Student(id, name, age, sex);
	}
}
