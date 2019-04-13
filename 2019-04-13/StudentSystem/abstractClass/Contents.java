package abstractClass;

public class Contents {
	public static void getContents() {

		System.out.println("************************请选择要操作的信息对应数字************************");
		System.out.println("*1.查看学生信息\t 2.添加学生信息\t 3.删除学生信息\t 4.修改学生信息\t 5.退出\t *");
		System.out.println("**************************************************************************");
		System.out.print("请选择:");
		String a = Welcome.s1.next();
		switch (a) {
		case "1":
			ViewStudent.getViem();
			break;
		case "2":
			new Student().setStudent();

			break;
		case "3":
			DeleteStudent.deleteStudent();
			break;
		case "4":
			ModifyStudent.setStudent();
			break;
		case "5":
			System.out.println("有缘再见");
			System.exit(0);
			break;
		default:
			System.out.println("请输入正确的数字");
			Contents.getContents();
			break;
		}
		// s1.close();

	}
}
