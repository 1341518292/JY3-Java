package abstractClass;

public class DeleteStudent {
	public static void deleteStudent() {
		if (Student.students.length > 0) {
			System.out.println("请输入要删除的ID");
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
			System.out.println("删除成功，自动返回上一级...");
		} else {
			System.out.println("当前数据为0");
		}
		Contents.getContents();
	}
}
