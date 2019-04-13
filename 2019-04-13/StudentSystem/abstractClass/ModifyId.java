package abstractClass;

import java.util.Scanner;

public class ModifyId {
	public static void setStudentId() {
		Student[] students = Student.getStudents();
		System.out.println("请输入要修改的id");
		int a = Welcome.s1.nextInt();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id == a) {
				System.out.print("请输入要修改的属性:");
				// System.out.println("1.姓名\t 2.年龄\t 3.年级\t 4.电话\t 5.邮箱\t 6.地址");
				switch (Welcome.s1.next()) {
				case "name":
					System.out.print("请输入修改后的数据:");
					String c = Welcome.s1.next();
					students[i].name = c;
					System.out.println("修改成功");
					break;
				case "age":
					System.out.print("请输入修改后的数据:");
					int d = Welcome.s1.nextInt();
					students[i].age = d;
					System.out.println("修改成功");
					break;
				case "phone":
					System.out.print("请输入修改后的数据:");
					long e = Welcome.s1.nextLong();
					students[i].phone = e;
					System.out.println("修改成功");
					break;
				case "email":
					System.out.print("请输入修改后的数据:");
					String f = Welcome.s1.next();
					students[i].email = f;
					System.out.println("修改成功");
					break;
				case "grade":
					System.out.print("请输入修改后的数据:");
					String g = Welcome.s1.next();
					students[i].grade = g;
					System.out.println("修改成功");
					break;
				case "address":
					System.out.print("请输入修改后的数据:");
					String h = Welcome.s1.next();
					students[i].address = h;
					System.out.println("修改成功");
					break;
				default:
					System.out.println("输入错误，自动返回");
					break;
				}

			}
		}
		System.out.println("系统自动返回上层目录....");
		ModifyStudent.setStudent();
	}

	public static void setAll() {
		Student[] students = Student.getStudents();
		System.out.println("请输入要修改的id");
		int a = Welcome.s1.nextInt();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id == a) {
				System.out.print("请输入学生姓名:");
				students[i].name = Welcome.s1.next();
				while (true) {
					Scanner s1 = new Scanner(System.in);
					System.out.print("请输入学生性别(男/女):");
					String str = s1.next();
					if (str.charAt(0) == '男' || str.charAt(0) == '女') {
						students[i].sex = str.charAt(0);
						break;
					} else {
						System.out.println("输入错误，请重新输入");
					}
				}

				while (true) {
					Scanner s1 = new Scanner(System.in);
					System.out.print("请输入学生年龄(int):");
					if (s1.hasNextInt()) {
						students[i].age = s1.nextInt();
						break;
					} else {
						System.out.println("输入错误，请重新输入");
					}
				}
				System.out.print("请输入学生所属年级(初级、中级、高级):");
				students[i].grade = Welcome.s1.next();
				System.out.print("请输入学生地址:");
				students[i].address = Welcome.s1.next();

				while (true) {
					Scanner s1 = new Scanner(System.in);
					System.out.print("请输入学生联系方式(11位手机号码):");
					long q = 10000000000l;
					if (s1.hasNextLong()) {
						long b = s1.nextLong();
						if (b / q == 1 && b > q) {
							students[i].phone = b;
							break;
						} else {
							System.out.println("输入错误，请重新输入");
						}
					} else {
						System.out.println("输入错误，请重新输入");
					}
				}
				System.out.print("请输入学生电子邮箱(包含@ 和 .com):");
				students[i].email = Welcome.s1.next();
				System.out.println("修改成功");
				System.out.println("系统自动返回上层目录....");
				ModifyStudent.setStudent();
			}
		}
	}
}