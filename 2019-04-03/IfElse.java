import java.util.*;
public class IfElse{
	public static void main(String[] args){
	//第二杯半价	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("请输入购买数量");
		int quantity = sc1.nextInt();	
		System.out.println("需要支付:"+HalfPrice(quantity)+"元");
	//银行利率问题	
		Scanner sc2 = new Scanner(System.in);
		System.out.println("请输入您的工资");
		double d1 = sc2.nextDouble();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("请输入你存多少年(整数)");
		int a = sc3.nextInt();
		String d = String.format("%.2f", InterestRate(d1,a));
		System.out.println("最终可以取出:"+d+"元");	
	}
	public static int HalfPrice(int x){
		int a = 0;
		if(x<1){
			System.out.println("不卖，滚！！！");
			
		}
		else{
			a = (x / 2) * 5 + (x - (x / 2)) * 10;
			
		}
		
			return a;
	}
	public static double InterestRate(double x,int y){
		for(int i=0;i<y;i++){
			if(y == 1){
				x +=  x * 0.5 *(7.7/100);	
			}
			if(y>1 && y<=3){
				 x +=  x * 0.7 *(7.7/100);
			}
			if(y>3 && y<=5){
				   x += x *(7.7/100);
			}
			if(y > 5){
				 x +=  x * 1.1 *(7.7/100);
			}
		}
			return x;
	}
}