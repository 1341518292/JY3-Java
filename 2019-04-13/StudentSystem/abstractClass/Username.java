package abstractClass;

public class Username {
	public static void Login(Admin admin) {

		System.out.print("�������û���:");
		String name = Welcome.s1.next();
		System.out.print("����������:");
		String psw = Welcome.s1.next();
		if (name.equals(admin.username) && psw.equals(admin.password)) {
			System.out.println("��¼�ɹ�");
			System.out.println("��ӭ������admin");
		} else {
			System.out.println("�˻����������");
			Welcome.welcomeDemo();
		}
		// s1.close();
	}
}

class Admin {

	String username;
	String password;

	public Admin() {
		username = "admin";
		password = "123456";
	}
}