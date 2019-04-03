import java.util.*;
public class ScoreDemo{
	public static void main(String[] args){
		System.out.println("请输入你的成绩");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if(score > 100||score < 0){
			System.out.println("Supenr Man");
		}
		else if(score >=90 && score <=100) {
			System.out.println("优秀");
		}
		else if(score >=80 && score <90) {
			System.out.println("良好");
		}
		else{
			System.out.println("不及格");
		}
		//
		
		int a = 1;
		System.out.println("请输入数字");
		while(a>0){
			
			Scanner sc2 = new Scanner(System.in);
			if(sc2.hasNextInt()){
			int num = sc2.nextInt();
			System.out.println("您输入的数是:"+num);
			if(num == -1){
			System.out.println("恭喜你退出去了");
			break;
			}
			}
			else{
			System.out.println("请重新输入数字");
			}
			
		}
		int b = 1;
		b = ++b;
		b = b++;
		b = b++ + ++b;
		System.out.println(b-- + ++b + b++ +b);
		System.out.println(b);
		int x = 3;
		int y = x++ + ++x + x * 10;
		System.out.println(x);
		System.out.print(y);
		System.out.print(5%10);
	}
}