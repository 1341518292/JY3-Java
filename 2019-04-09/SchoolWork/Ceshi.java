package School;

import java.util.*;

public class Ceshi {
	public static void main(String[] args) {
		// ����10�Ľ׳�
		System.out.println(Factorial(10));
		// �ҳ�1000���ڵ���������
		System.out.println(Arrays.toString(Factor(1000)));
		// С�����µĸ߶�����
		System.out.println(Arrays.toString(Rebound(10, 100)));
		// ���������
		Yang();
		//�򼦵�����
		Chicken();
		//��������
		System.out.println(Rabbit(12));
		//ѡ������
		int[]a= {10,-5,2,13,100,99,1,-55,0};
		System.out.println(Arrays.toString(selectSort(a)));
		//
	//	QQQ(10);
	}

	public static int Factorial(int a) {
		int x = 1;
		for (int i = 1; i <= a; i++) {
			x *= i;

		}
		return x;
	}

	public static int[] Factor(int x) {
		int[] a = {};

		for (int i = 1; i <= x; i++) {
			int b = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					b += j;
				}
			}

			if (i == b) {
				a = Arrays.copyOf(a, a.length + 1);
				a[a.length - 1] = i;
			}
		}

		return a;
	}

	public static double[] Rebound(int x, int y) {
		double a[] = new double[2];
		double d = 0.0;
		for (double i = 1; i <= x; i++) {
			d = d + y / (2 * i);
			if (i == x) {
				a[0] = y / (2 * i);
			}
		}
		a[1] = (double) Math.round(d * 100) / 100;
		return a;
	}

	public static void Yang() {
		// ��ά����
		int[][] a = new int[10][10];
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				if (j == 0 || j == i) {
					a[i][j] = 1;
				} else {
					a[i][j] = a[i - 1][j] + a[i - 1][j - 1];
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void Chicken() {

		for(int a=0;a<=100; a++) {
			for(int b=0;b<=100; b++) {
				for(int c=0;c<=100; c++) {
					if(5*a + 3*b +c/3 ==100 && a+b+c ==100) {
						System.out.println("����:"+a+",ĸ��:"+b+",С��:"+c);
					}
				}
			}
		}
	}
	
	public static int Rabbit(int x) {
		int a = 1; //С����
		int b = 0; //������
		for(int i=1;i<=x;i++) {
			if(i%3==0 || i>6) {
				b=b+1;
				a=a-1;
		//		System.out.println("��"+i+"����a��ֵ:"+a+"b��ֵ:"+b);
			}
			if(i>2) {
				a =a + b ;
				
			//	System.out.println("��"+i+"����a��ֵ:"+a+"b��ֵ:"+b);
			}
			
		}
				
		return a+b;
	}
	public static int[] selectSort(int[] x) {
		for(int i=0;i<x.length-1;i++) {
			int temp =0;
			for(int j=1;j<x.length-i;j++) {
				if(x[i]>x[j+i]) {
					temp =x[i];
					x[i]=x[j+i];
					x[j+i]= temp;
				}
			}
		}
		
		return x;
	}
	public static int QQQ(int x) {
		//��n����Χ��һȦ,˳���ź�,�ӵ�һ���˿�ʼ����(��1��3����)
		//������3�����˳�Ȧ��,��������µ���ԭ���ڼ��ŵ���λ
			int[] a =new int[x+1];
			for(int i=1;i<=x;i++) {
				a[i]=i;
			}
			
			for(int i=1;i<x;i++) {
				if(a[i]!=0) {
					for(int j=1;j<=x;j++) {
						if(j==3) {
							System.out.println(Arrays.toString(a));
						}
						
					}
					
				}
			}
	return 0;
	
	}
}