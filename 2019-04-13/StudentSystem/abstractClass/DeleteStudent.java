package abstractClass;

public class DeleteStudent {
	public static void deleteStudent() {
		if (Student.students.length > 0) {
			System.out.println("������Ҫɾ����ID");
			int x = Welcome.s1.nextInt();
			Student[] st1 = Student.getStudents();
			int j = 0;
			Student[] newStu = new Student[st1.length - 1];
			for (int i = 0; i < st1.length; i++) {
				if (st1[i].id != x) {
					newStu[j] = st1[i];
					j++;
				}
			}
			Student.students = newStu;
			System.out.println("ɾ���ɹ����Զ�������һ��...");
		} else {
			System.out.println("��ǰ����Ϊ0");
		}
		Contents.getContents();
	}
}
