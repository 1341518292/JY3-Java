package abstractClass;

import java.util.Arrays;

public class ViewStudent {
	public static void getViem() {

		System.out.println("**************************************************************************");
		System.out.println("* 1.查看所有学生信息   2.根据id查询学生信息   3.根据id查询学生姓名   4.返回上一层");
		System.out.println("**************************************************************************");
		System.out.print("请选择:");
		String a = Welcome.s1.next();
		switch (a) {
		case "1":
			System.out.println(Arrays.toString(Student.students));
			getViem();
			break;
		case "2":
			System.out.print("请输入要查询的id:");
			int b = Welcome.s1.nextInt();
			IdView.getIdView(b);
			break;
		case "3":
			System.out.print("请输入要查询的id");
			int c = Welcome.s1.nextInt();
			IdView.getIdName(c);
			break;
		case "4":
			Contents.getContents();
			break;
		default:
			System.out.println("请输入正确的值");
			ViewStudent.getViem();
			break;
		}
	}

	public static void main(String[] args) {
		getViem();
	}
}
