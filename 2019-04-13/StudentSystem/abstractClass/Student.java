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

		System.out.println("*******************************添加学生信息*******************************");

		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("请输入学生id(int):");
			if (s1.hasNextInt()) {
				this.id = s1.nextInt();
				break;
			} else {
				System.out.println("输入错误，请重新输入");
			}
		}

		System.out.print("请输入学生姓名:");
		this.name = Welcome.s1.next();
		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("请输入学生性别(男/女):");
			String str = s1.next();
			if (str.charAt(0) == '男' || str.charAt(0) == '女') {
				this.sex = str.charAt(0);
				break;
			} else {
				System.out.println("输入错误，请重新输入");
			}
		}

		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("请输入学生年龄(int):");
			if (s1.hasNextInt()) {
				this.age = s1.nextInt();
				break;
			} else {
				System.out.println("输入错误，请重新输入");
			}
		}
		System.out.print("请输入学生所属年级(初级、中级、高级):");
		this.grade = Welcome.s1.next();
		System.out.print("请输入学生地址:");
		this.address = Welcome.s1.next();

		while (true) {
			Scanner s1 = new Scanner(System.in);
			System.out.print("请输入学生联系方式(11位手机号码):");
			long a = 10000000000l;
			if (s1.hasNextLong()) {
				long b = s1.nextLong();
				if (b / a == 1 && b > a) {
					this.phone = b;
					break;
				} else {
					System.out.println("输入错误，请重新输入");
				}
			} else {
				System.out.println("输入错误，请重新输入");
			}
		}
		System.out.print("请输入学生电子邮箱(包含@ 和 .com):");
		this.email = Welcome.s1.next();
		// Student student = new Student(1, name, sex, age, grade, address, phone,
		// email);
		students = Arrays.copyOf(students, students.length + 1);
		students[students.length - 1] = this;
		System.out.println("数据保存成功，系统将自动返回上层目录~");
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
