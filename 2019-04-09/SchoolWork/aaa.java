package School;
import java.util.Scanner;


public class aaa {
	public static void main(String[] args) {
	//��ӡ����200��С������	
		int j;
		for (int i = 2; i <= 220; i++) // 1��������������ֱ�Ӵ�2��ʼѭ��
		{
			j = 2;
			while (i % j != 0) {
				j++; // ����2��i�������Ƿ��ܱ�i�������粻�ܾ��Լ�
			}
			if (j == i && i >200) // ���б�����������ʱ���ж����ǲ�������
			{
				System.out.println(i); // ����Ǿʹ�ӡ������
			}
		}
		//������������
		  Scanner scanner = new Scanner(System.in);
		  scanner.close();
// ��ӡһ�����Ľ׳�   (i)
//			int sum =1;
//		for(int i=1;i<=5;i++) {
//			sum *=i;
//		}
//		
//		System.out.println(sum);
//�����ʾֻ��Ļ��
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

		
		
//��һ��������5λ��������,�����Ǽ�λ��,�ֱ��ӡ��ÿһλ����(a)
//     int a = 13;
//     
//     if(a/10000>=1 && a<=99999) {
//    	 System.out.println("5λ��");
//    	 System.out.println("��λ:"+a/10000+"ǧλ:"+a%10000/1000+"��λ:"+a%1000/100+"ʮλ:"+a%100/10+"��λ:"+a%10);
//     }
//     else if(a/1000>=1&& a<=9999) {
//    	 System.out.println("4λ��");
//    	 System.out.println("ǧλ:"+a/1000+"��λ:"+a%1000/100+"ʮλ:"+a%100/10+"��λ:"+a%10);
//     }
//     else  if(a/100>=1&& a<=999) {
//    	 System.out.println("3λ��");
//    	 System.out.println("��λ:"+a/100+"ʮλ:"+a%100/10+"��λ:"+a%10);
//     }	
//     else if(a/10>=1&& a<=99) {
//    	 System.out.println("2λ��");
//    	 System.out.println("ʮλ:"+a/10+"��λ:"+a%10);
//     }		
//     else {
//    	 System.out.println("������ĳ���5λ��");
//     }	

		
//������������x,y,z���������������С�������		
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
		
		
		
//����ĳԱ���������н��30000Ԫ,10���Ĺ��ʺ��ܹ��ʡ�		
//		double a = 30000;
//		double sum =0;
//		for(int i=1;i<=10;i++) {
//			a += a * 0.06;
//			sum +=a;
//		}
//		System.out.println("ʮ�����:"+a);
//		System.out.println("ʮ����ܹ���:"+sum);

		
//����һ���ɼ�a��ʹ��switch�ṹ���(x)�ĵȼ�
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

		
//��ҵ���ŵĽ�������������
//		Scanner sc  = new Scanner(System.in);
//		System.out.println("����������");
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
//		System.out.println("�ܽ���Ϊ:"+x+"��Ԫ");
//		sc.close();
		
		
//��forѭ����д��1��100������������ӵĺ�		
//		int sum =0;
//		for(int i=1;i<=100;i++) {
//			if(i%2!=0) {
//				sum += i;
//			}
//		}
//	System.out.println(sum);
		
		
//�ж�x�Ƿ�Ϊż������Ϊż�������ڿ���̨�ϴ�ӡ���������ֵ��ż��������x�Ƿ�Ϊż�������Ҫ�ڿ���̨�����x��ֵ		
//		int x= 15;
//		if(x%2==0) {
//			System.out.print("�������ֵ��ż��:");
//		}
//		System.out.println(x);


		
//�򵥵���		
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
