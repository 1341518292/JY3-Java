import java.util.*;
public class Distance{
	public static void main(String[] args){
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		System.out.println("�������һ�����x����");
		Scanner s1 = new Scanner(System.in);
		x1 = s1.nextInt();
		System.out.println("�������һ�����y����");
		Scanner t1 = new Scanner(System.in);
		y1 = t1.nextInt();
		//
		System.out.println("������ڶ������x����");
		Scanner s2 = new Scanner(System.in);
		x2 = s2.nextInt();
		System.out.println("������ڶ������y����");
		Scanner t2 = new Scanner(System.in);
		y2 = t2.nextInt();
		double a = Math.sqrt(Math.abs((x1-x2)*(x1-x2)-(y1-y2)*(y1-y2)));
		System.out.println("����֮��ľ���Ϊ:"+a);
		char b  = 54;
		int c = b - 48;
		System.out.println(c);
	}
}