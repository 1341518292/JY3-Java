import java.util.*;
public class Login{
	public static void main(String[] args){
		System.out.println("�������û���(������)");
		Scanner sc1 = new Scanner(System.in);
		String userName = sc1.next();
		System.out.println("����������(123)");
		Scanner sc2 = new Scanner(System.in);
		String userPsw = sc2.next();
		getLogin(userName,userPsw);

	}
	public static void getLogin(String a,String b){
		if(a.equals("������") && b.equals("123")){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
	}
	
}