package com.Weian.Test;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("����������");
		String str1 = s1.next();
		System.out.println("�������Ա�(1��ʾŮ;0��ʾ��)");
		int a1 = s1.nextInt();
		System.out.println("����������");
		int a2 = s1.nextInt();
		System.out.println("�������ͥ��ַ");
		String str2 = s1.next();
		Person p1 = new Person("����", 1, 18, "��ܰ��Ԣ");
		Person p2 = new Person(str1, a1, a2, str2);
		// �жϽ��ǰ
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		p1.personMarry(p2);
		// �жϽ���
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
			System.out.println("��ϲ���ǽ��ɹ�");
			this.marry = true;
			p.marry = true;
			this.mate = p.name;
			p.mate = this.name;
			return true;
		} else {
			if (Math.abs(this.age - p.age) > 10) {
				System.out.println("������������̫����");
			}
			if (this.address.equals(p.address)) {

			} else {
				System.out.println("����������̫Զ��");
			}
			if (this.sex == p.sex) {
				System.out.println("ͬ�Բ����氮������");
			}
			System.out.println("���ź������ʧ��");
			return false;
		}

	}

}