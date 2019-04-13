package abstractClass;

public class IdView {
	public static void getIdView(int x) {
		Student[] students = Student.getStudents();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id == x) {
				System.out.println("--------------------------------学生信息--------------------------------");
				System.out.println(
						"|学号     |姓名        |年龄       |性别     |年级        |电话                    |邮箱                      |地址           ");
				System.out.println("------------------------------------------------------------------------");
				System.out.println("|" + students[i].id + "    |" + students[i].name + " |" + students[i].age + "    |"
						+ students[i].sex + "    |" + students[i].grade + "  |" + students[i].phone + " |"
						+ students[i].email + "  |" + students[i].address);
				System.out.println("------------------------------------------------------------------------");
				System.out.println("数据查询完毕，系统将自动返回目录......");

			}
		}
		ViewStudent.getViem();
	}

	public static void getIdName(int x) {
		Student[] students = Student.getStudents();
		for (int i = 0; i < students.length; i++) {
			if (students[i].id == x) {
				System.out.println("--------------------------------学生信息--------------------------------");
				System.out.println("|学号 \t |姓名 \t ");
				System.out.println("------------------------------------------------------------------------");
				System.out.println("|" + students[i].id + "|" + students[i].name);
				System.out.println("------------------------------------------------------------------------");
				System.out.println("数据查询完毕，系统将自动返回目录......");

			}
		}
		ViewStudent.getViem();
	}
}
