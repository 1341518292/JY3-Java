import java.util.*;
public class Login{
	public static void main(String[] args){
		System.out.println("请输入用户名(阿萨德)");
		Scanner sc1 = new Scanner(System.in);
		String userName = sc1.next();
		System.out.println("请输入密码(123)");
		Scanner sc2 = new Scanner(System.in);
		String userPsw = sc2.next();
		getLogin(userName,userPsw);

	}
	public static void getLogin(String a,String b){
		if(a.equals("阿萨德") && b.equals("123")){
			System.out.println("登录成功");
		}else{
			System.out.println("登录失败");
		}
	}
	
}