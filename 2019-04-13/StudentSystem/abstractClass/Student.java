package abstractClass;

import java.util.Arrays;
import java.util.Scanner;

public class Student {
	int id;
	String name;
	char sex;
	int age;
	String grade;
	String address;
	long phone;
	String email;
	static Student[] students = {};
	static Student[] newStudents = {};

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, char sex, int age, String grade, String address, long phone, String email) {
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.grade = grade;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	public void setStudent() {

		System.out.println("*******************************���ѧ����Ϣ*******************************");

		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("������ѧ��id(int):");
			if (s1.hasNextInt()) {
				this.id = s1.nextInt();
				break;
			} else {
				System.out.println("�����������������");
			}
		}

		System.out.print("������ѧ������:");
		this.name = Welcome.s1.next();
		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("������ѧ���Ա�(��/Ů):");
			String str = s1.next();
			if (str.charAt(0) == '��' || str.charAt(0) == 'Ů') {
				this.sex = str.charAt(0);
				break;
			} else {
				System.out.println("�����������������");
			}
		}

		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("������ѧ������(int):");
			if (s1.hasNextInt()) {
				this.age = s1.nextInt();
				break;
			} else {
				System.out.println("�����������������");
			}
		}
		System.out.print("������ѧ�������꼶(�������м����߼�):");
		this.grade = Welcome.s1.next();
		System.out.print("������ѧ����ַ:");
		this.address = Welcome.s1.next();

		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("������ѧ����ϵ��ʽ(11λ�ֻ�����):");
			long a = 10000000000l;
			if (s1.hasNextLong()) {
				long b = s1.nextLong();
				if (b / a == 1 && b > a) {
					this.phone = b;
					break;
				} else {
					System.out.println("�����������������");
				}
			} else {
				System.out.println("�����������������");
			}
		}
		System.out.print("������ѧ����������(����@ �� .com):");
		this.email = Welcome.s1.next();
		// Student student = new Student(1, name, sex, age, grade, address, phone,
		// email);
		students = Arrays.copyOf(students, students.length + 1);
		students[students.length - 1] = this;
		System.out.println("���ݱ���ɹ���ϵͳ���Զ������ϲ�Ŀ¼~");
		Contents.getContents();
	}

	public static Student[] getStudents() {
		return students;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", grade=" + grade
				+ ", address=" + address + ", phone=" + phone + ", email=" + email + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		new Student().setStudent();
	}
}
