package School;
import java.util.Scanner;


public class aaa {
	public static void main(String[] args) {
	//打印大于200最小的素数	
		int j;
		for (int i = 2; i <= 220; i++) // 1不是素数，所以直接从2开始循环
		{
			j = 2;
			while (i % j != 0) {
				j++; // 测试2至i的数字是否能被i整除，如不能就自加
			}
			if (j == i && i >200) // 当有被整除的数字时，判断它是不是自身
			{
				System.out.println(i); // 如果是就打印出数字
			}
		}
		//无视下面两句
		  Scanner scanner = new Scanner(System.in);
		  scanner.close();
// 打印一个数的阶乘   (i)
//			int sum =1;
//		for(int i=1;i<=5;i++) {
//			sum *=i;
//		}
//		
//		System.out.println(sum);
//计算邮局汇款的汇费
//		double a = 35;
//		double h =0;
//		if(a<100) {
//			h = 1;
//		}
//		if(a>=100 && a<=5000) {
//			h = a * 0.01;
//		}
//		if(a>5000) {
//			h =50;
//		}
//		System.out.println(h);

		
		
//有一个不多于5位的正整数,求它是几位数,分别打印出每一位数字(a)
//     int a = 13;
//     
//     if(a/10000>=1 && a<=99999) {
//    	 System.out.println("5位数");
//    	 System.out.println("万位:"+a/10000+"千位:"+a%10000/1000+"百位:"+a%1000/100+"十位:"+a%100/10+"个位:"+a%10);
//     }
//     else if(a/1000>=1&& a<=9999) {
//    	 System.out.println("4位数");
//    	 System.out.println("千位:"+a/1000+"百位:"+a%1000/100+"十位:"+a%100/10+"个位:"+a%10);
//     }
//     else  if(a/100>=1&& a<=999) {
//    	 System.out.println("3位数");
//    	 System.out.println("百位:"+a/100+"十位:"+a%100/10+"个位:"+a%10);
//     }	
//     else if(a/10>=1&& a<=99) {
//    	 System.out.println("2位数");
//    	 System.out.println("十位:"+a/10+"个位:"+a%10);
//     }		
//     else {
//    	 System.out.println("你输入的超过5位数");
//     }	

		
//输入三个整数x,y,z，请把这三个数由小到大输出		
//		Scanner sc1 = new Scanner(System.in);
//		int a = sc1.nextInt();
//		int b = sc1.nextInt();
//		int c = sc1.nextInt();
//		int temp =0;
//		if (a>b) {
//			temp =b;
//			b = a;
//			a = temp;
//		}
//		if (a>c) {
//			temp =c;
//			c = a;
//			a = temp;
//		}
//		if (b>c) {
//			temp =b;
//			b = c;
//			c = temp;
//		}
//		System.out.println(a+"<"+b+"<"+c);
//		sc1.close();
		
		
		
//假设某员工今年的年薪是30000元,10年后的工资和总工资。		
//		double a = 30000;
//		double sum =0;
//		for(int i=1;i<=10;i++) {
//			a += a * 0.06;
//			sum +=a;
//		}
//		System.out.println("十年后工资:"+a);
//		System.out.println("十年后总工资:"+sum);

		
//给定一个成绩a，使用switch结构求出(x)的等级
//     Scanner sc = new Scanner(System.in);
//     int x  = sc.nextInt()/10;
//		switch (x) {
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("E");
//			break;
//		}

		
//企业发放的奖金根据利润提成
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("请输入利润");
//		double x = sc.nextDouble();
//		if(x<=10) {
//			x += x*0.1;
//		}
//		if( x>10&&x<=20) {
//			x += (x-10)*0.075;
//		}
//		if(x>20&&x<=40) {
//			x += (x-20)*0.05;
//		}
//		if(x>40&&x<=60) {
//			x += (x-40)*0.03;
//		}
//		if(x>60&&x<=100) {
//			x += (x-60)*0.015;
//		}
//		if(x>100) {
//			x += (x-100)*0.01;
//		}
//		System.out.println("总奖金为:"+x+"万元");
//		sc.close();
		
		
//用for循环改写从1到100的所有奇数相加的和		
//		int sum =0;
//		for(int i=1;i<=100;i++) {
//			if(i%2!=0) {
//				sum += i;
//			}
//		}
//	System.out.println(sum);
		
		
//判断x是否为偶数，若为偶数，则在控制台上打印“输入的数值是偶数”无论x是否为偶数，最后都要在控制台上输出x的值		
//		int x= 15;
//		if(x%2==0) {
//			System.out.print("输入的数值是偶数:");
//		}
//		System.out.println(x);


		
//简单的题		
//		int a = 9;
//		int b =6; 
//		System.out.println(a>b ? a:b);	
//===================================================
//		int a =1;
//		int b =2;
//		int temp =0;
//		temp = a;
//		a = b ;
//		b =temp;
//		System.out.println(a);
//		System.out.println(b);
//=========================================================
//		int a = 541;
//		int sum =0;
//		sum = a/100 +a%10+a/10%10;
//		System.out.println(sum);
	}

}
