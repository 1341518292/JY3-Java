package com.Weian.Test;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输入名字");
		String str1 = s1.next();
		System.out.println("请输入性别(1表示女;0表示男)");
		int a1 = s1.nextInt();
		System.out.println("请输入年龄");
		int a2 = s1.nextInt();
		System.out.println("请输入家庭地址");
		String str2 = s1.next();
		Person p1 = new Person("阿珍", 1, 18, "致馨公寓");
		Person p2 = new Person(str1, a1, a2, str2);
		// 判断结婚前
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.personMarry(p2);
		// 判断结婚后
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		s1.close();
	}
}

class Person {
	int num;
	String name;
	int sex;
	int age;
	boolean marry;
	int id;
	String address;
	String iphone;
	String mate;

	public String toString() {
		return " name=" + name + ", sex=" + sex + ", age=" + age + ", marry=" + marry + ", id=" + id + ", address="
				+ address + ", mate=" + mate;
	}

	public Person(String name, int sex, int age, String address) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.address = address;

	}

	public Person() {

	}

	public boolean personMarry(Person p) {
		if (this.sex != p.sex && Math.abs(this.age - p.age) <= 10 && this.address.equals(p.address)) {
			System.out.println("恭喜你们结婚成功");
			this.marry = true;
			p.marry = true;
			this.mate = p.name;
			p.mate = this.name;
			return true;
		} else {
			if (Math.abs(this.age - p.age) > 10) {
				System.out.println("你们俩年龄差距太大了");
			}
			if (this.address.equals(p.address)) {

			} else {
				System.out.println("你们俩距离太远了");
			}
			if (this.sex == p.sex) {
				System.out.println("同性才是真爱？？？");
			}
			System.out.println("很遗憾，结婚失败");
			return false;
		}

	}

}