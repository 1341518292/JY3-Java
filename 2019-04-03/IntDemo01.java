import java.util.*;
public class IntDemo01{
	public static void main(String[] args){
		System.out.println("请输入要转换的数字");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextInt()){
			int a  =  sc.nextInt();
			System.out.println("数字转换为:"+CharDemo(a));
		}
		else{
			System.out.println("请输入正确的数字");
		}
		System.out.println("请输入要转换的字符串");
		Scanner sc2 = new Scanner(System.in);
		
		String str = sc2.next();
		for(int i = 0;i<str.length();i++){
		char b = str.charAt(i);
		System.out.println("第"+(i+1)+"个字符转换为:"+IntDemo(b));
		}
		for(int i=1;i<10;i++){
				
			for(int j=1;j<10;j++){
				System.out.print(i+"*"+j+"="+(i*j)+"  ");
			}
			System.out.print('\n');
		}
		
	
	}
	public static char CharDemo(int x){
		char a = (char) x;
		return a ;
	}
	public static int IntDemo(char x){
		int a  = (int) x;
		return a;
	}
}