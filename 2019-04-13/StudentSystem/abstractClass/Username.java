package abstractClass;

public class Username {
	public static void Login(Admin admin) {

		System.out.print("请输入用户名:");
		String name = Welcome.s1.next();
		System.out.print("请输入密码:");
		String psw = Welcome.s1.next();
		if (name.equals(admin.username) && psw.equals(admin.password)) {
			System.out.println("登录成功");
			System.out.println("欢迎回来，admin");
		} else {
			System.out.println("账户或密码错误");
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