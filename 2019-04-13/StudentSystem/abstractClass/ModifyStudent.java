package abstractClass;

public class ModifyStudent {
	public static void setStudent() {

		System.out.println("**************************************************************************");
		System.out.println("1.根据id修改学生全部信息        2.根据id修改学生部分信息         3.返回上级         4.系统退出");
		System.out.println("**************************************************************************");
		System.out.print("请选择:");
		String a = Welcome.s1.next();
		switch (a) {
		case "1":
			ModifyId.setAll();
			break;
		case "2":
			ModifyId.setStudentId();
			break;
		case "3":
			Contents.getContents();
			break;
		case "4":
			System.out.println("有缘再见");
			System.exit(0);
			break;
		default:
			System.out.println("请重新输入");
			setStudent();
			break;
		}
	}
}
