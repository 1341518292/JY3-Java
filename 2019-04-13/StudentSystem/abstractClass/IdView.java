package abstractClass;

public class IdView {
	public static void getIdView(int x) {
		Student[] students = Student.getStudents();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id == x) {
				System.out.println("--------------------------------ѧ����Ϣ--------------------------------");
				System.out.println(
						"|ѧ��     |����        |����       |�Ա�     |�꼶        |�绰                    |����                      |��ַ           ");
				System.out.println("------------------------------------------------------------------------");
				System.out.println("|" + students[i].id + "    |" + students[i].name + " |" + students[i].age + "    |"
						+ students[i].sex + "    |" + students[i].grade + "  |" + students[i].phone + " |"
						+ students[i].email + "  |" + students[i].address);
				System.out.println("------------------------------------------------------------------------");
				System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼......");

			}
		}
		ViewStudent.getViem();
	}

	public static void getIdName(int x) {
		Student[] students = Student.getStudents();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id == x) {
				System.out.println("--------------------------------ѧ����Ϣ--------------------------------");
				System.out.println("|ѧ�� \t |���� \t ");
				System.out.println("------------------------------------------------------------------------");
				System.out.println("|" + students[i].id + "|" + students[i].name);
				System.out.println("------------------------------------------------------------------------");
				System.out.println("���ݲ�ѯ��ϣ�ϵͳ���Զ�����Ŀ¼......");

			}
		}
		ViewStudent.getViem();
	}
}
