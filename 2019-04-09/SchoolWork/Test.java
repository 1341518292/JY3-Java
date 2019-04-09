package School;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("请输玩的人数");
		int a = s1.nextInt();
		System.out.println("第" + getRemaining(a) + "个人留下来了");
		s1.close();
	}

	public static int getRemaining(int q) {
		int a = 0;// 下标
		boolean[] x = new boolean[q];
		for (int i = 0; i < x.length; i++) {
			x[i] = true;
		}
		System.out.println("玩前" + Arrays.toString(x));
		for (int i = 1; i <= (x.length - 1) * 3; i++) {

			if (a > x.length - 1) {
				a = 0;
			}
			if (x[a] == false) {
				a += 1;
			}
			if (i % 3 == 0 && i != (x.length - 1) * 3) {

				x[a] = false;

			}
			if (i == (x.length - 1) * 3) {
				for (int j = 0; j < x.length; j++) {
					if (a > x.length - 1) {
						a = 0;
					}
					if (x[a] == false) {
						a += 1;
					}
				}

				x[a] = false;
			}
//			System.out.println("i="+i);
//			System.out.println("a="+a);
			a++;

		}
		System.out.println("玩后" + Arrays.toString(x));
		int b = 0;
		for (int w = 0; w < x.length; w++) {
			if (x[w] == true) {
				b = w + 1;
			}
		}
		return b;
	}
}
