package abstractClass;

public class ModifyStudent {
	public static void setStudent() {

		System.out.println("**************************************************************************");
		System.out.println("1.����id�޸�ѧ��ȫ����Ϣ        2.����id�޸�ѧ��������Ϣ         3.�����ϼ�         4.ϵͳ�˳�");
		System.out.println("**************************************************************************");
		System.out.print("��ѡ��:");
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
			System.out.println("��Ե�ټ�");
			System.exit(0);
			break;
		default:
			System.out.println("����������");
			setStudent();
			break;
		}
	}
}
