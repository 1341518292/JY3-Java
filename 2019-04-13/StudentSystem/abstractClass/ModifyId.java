package abstractClass;

import java.util.Scanner;

public class ModifyId {
	public static void setStudentId() {
		Student[] students = Student.getStudents();
		System.out.println("������Ҫ�޸ĵ�id");
		int a = Welcome.s1.nextInt();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id == a) {
				System.out.print("������Ҫ�޸ĵ�����:");
				// System.out.println("1.����\t 2.����\t 3.�꼶\t 4.�绰\t 5.����\t 6.��ַ");
				switch (Welcome.s1.next()) {
				case "name":
					System.out.print("�������޸ĺ������:");
					String c = Welcome.s1.next();
					students[i].name = c;
					System.out.println("�޸ĳɹ�");
					break;
				case "age":
					System.out.print("�������޸ĺ������:");
					int d = Welcome.s1.nextInt();
					students[i].age = d;
					System.out.println("�޸ĳɹ�");
					break;
				case "phone":
					System.out.print("�������޸ĺ������:");
					long e = Welcome.s1.nextLong();
					students[i].phone = e;
					System.out.println("�޸ĳɹ�");
					break;
				case "email":
					System.out.print("�������޸ĺ������:");
					String f = Welcome.s1.next();
					students[i].email = f;
					System.out.println("�޸ĳɹ�");
					break;
				case "grade":
					System.out.print("�������޸ĺ������:");
					String g = Welcome.s1.next();
					students[i].grade = g;
					System.out.println("�޸ĳɹ�");
					break;
				case "address":
					System.out.print("�������޸ĺ������:");
					String h = Welcome.s1.next();
					students[i].address = h;
					System.out.println("�޸ĳɹ�");
					break;
				default:
					System.out.println("��������Զ�����");
					break;
				}

			}
		}
		System.out.println("ϵͳ�Զ������ϲ�Ŀ¼....");
		ModifyStudent.setStudent();
	}

	public static void setAll() {
		Student[] students = Student.getStudents();
		System.out.println("������Ҫ�޸ĵ�id");
		int a = Welcome.s1.nextInt();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id == a) {
				System.out.print("������ѧ������:");
				students[i].name = Welcome.s1.next();
				while (true) {
					Scanner s1 = new Scanner(System.in);
					System.out.print("������ѧ���Ա�(��/Ů):");
					String str = s1.next();
					if (str.charAt(0) == '��' || str.charAt(0) == 'Ů') {
						students[i].sex = str.charAt(0);
						break;
					} else {
						System.out.println("�����������������");
					}
				}

				while (true) {
					Scanner s1 = new Scanner(System.in);
					System.out.print("������ѧ������(int):");
					if (s1.hasNextInt()) {
						students[i].age = s1.nextInt();
						break;
					} else {
						System.out.println("�����������������");
					}
				}
				System.out.print("������ѧ�������꼶(�������м����߼�):");
				students[i].grade = Welcome.s1.next();
				System.out.print("������ѧ����ַ:");
				students[i].address = Welcome.s1.next();

				while (true) {
					Scanner s1 = new Scanner(System.in);
					System.out.print("������ѧ����ϵ��ʽ(11λ�ֻ�����):");
					long q = 10000000000l;
					if (s1.hasNextLong()) {
						long b = s1.nextLong();
						if (b / q == 1 && b > q) {
							students[i].phone = b;
							break;
						} else {
							System.out.println("�����������������");
						}
					} else {
						System.out.println("�����������������");
					}
				}
				System.out.print("������ѧ����������(����@ �� .com):");
				students[i].email = Welcome.s1.next();
				System.out.println("�޸ĳɹ�");
				System.out.println("ϵͳ�Զ������ϲ�Ŀ¼....");
				ModifyStudent.setStudent();
			}
		}
	}
}