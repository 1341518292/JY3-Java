import java.util.*;
public class Demo01{
	public static void main(String[] args){
		//ƽ��
		System.out.println("����һ��������ƽ��");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("�����"+a*a);
		//ϲȵ
		double d = (946080000000.0 * 4.2) / 0.45;
		System.out.println("��Ҫ"+d+"ֻϲȵ");
		//С���384������
		double e = 2 * 9.8 * 384;
		System.out.println("С��������Ҫ"+(int)(384/Math.sqrt(e))+"��");
		Scanner scanner = new Scanner(System.in);
		System.out.println("��������֤��Qea");
		String st = scanner.nextLine();
		String aa = "Qea";
		if( st.equals(aa)){
			System.out.println("������ȷ");
		}
	 	 else{
			 System.out.println("�������");
		 }
	}
}