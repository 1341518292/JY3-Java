import java.util.*;
public class Demo01{
	public static void main(String[] args){
		//平方
		System.out.println("输入一个数计算平方");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("结果："+a*a);
		//喜鹊
		double d = (946080000000.0 * 4.2) / 0.45;
		System.out.println("需要"+d+"只喜鹊");
		//小球从384米落下
		double e = 2 * 9.8 * 384;
		System.out.println("小球落下需要"+(int)(384/Math.sqrt(e))+"秒");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入验证码Qea");
		String st = scanner.nextLine();
		String aa = "Qea";
		if( st.equals(aa)){
			System.out.println("输入正确");
		}
	 	 else{
			 System.out.println("输入错误");
		 }
	}
}