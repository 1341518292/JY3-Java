import java.util.Random;
public class Utfa{
	public static void main(String[] args){
		int age1 =21;
		int	age2 =22;
		int num = age1 + age2;
		System.out.println(num);
		char ch = '¹ú';
		System.out.println((int)ch);
		int a = 19;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toHexString(a));
		System.out.println(Integer.toOctalString(a));
		long l1 = 12345678901l;
		float f1 = 3.1415926f;
		double d1 = 1234567890.0987654321d;
		Random ran = new Random();
		int sg = ran.nextInt(24)+65;
		System.out.println((char)sg);
		int q = 97;
		char ch1 = 0;
		System.out.println((char)q);
		System.out.println((int)ch1);
	}

}