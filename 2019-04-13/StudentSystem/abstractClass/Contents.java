package abstractClass;

public class Contents {
	public static void getContents() {

		System.out.println("************************��ѡ��Ҫ��������Ϣ��Ӧ����************************");
		System.out.println("*1.�鿴ѧ����Ϣ\t 2.���ѧ����Ϣ\t 3.ɾ��ѧ����Ϣ\t 4.�޸�ѧ����Ϣ\t 5.�˳�\t *");
		System.out.println("**************************************************************************");
		System.out.print("��ѡ��:");
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
			System.out.println("��Ե�ټ�");
			System.exit(0);
			break;
		default:
			System.out.println("��������ȷ������");
			Contents.getContents();
			break;
		}
		// s1.close();

	}
}
