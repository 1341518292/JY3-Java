package abstractClass;

import java.util.Arrays;

public class ViewStudent {
	public static void getViem() {

		System.out.println("**************************************************************************");
		System.out.println("* 1.�鿴����ѧ����Ϣ   2.����id��ѯѧ����Ϣ   3.����id��ѯѧ������   4.������һ��");
		System.out.println("**************************************************************************");
		System.out.print("��ѡ��:");
		String a = Welcome.s1.next();
		switch (a) {
		case "1":
			System.out.println(Arrays.toString(Student.students));
			getViem();
			break;
		case "2":
			System.out.print("������Ҫ��ѯ��id:");
			int b = Welcome.s1.nextInt();
			IdView.getIdView(b);
			break;
		case "3":
			System.out.print("������Ҫ��ѯ��id");
			int c = Welcome.s1.nextInt();
			IdView.getIdName(c);
			break;
		case "4":
			Contents.getContents();
			break;
		default:
			System.out.println("��������ȷ��ֵ");
			ViewStudent.getViem();
			break;
		}
	}

	public static void main(String[] args) {
		getViem();
	}
}
