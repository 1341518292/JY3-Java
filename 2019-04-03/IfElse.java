import java.util.*;
public class IfElse{
	public static void main(String[] args){
	//�ڶ������	
		Scanner sc1 = new Scanner(System.in);
		System.out.println("�����빺������");
		int quantity = sc1.nextInt();	
		System.out.println("��Ҫ֧��:"+HalfPrice(quantity)+"Ԫ");
	//������������	
		Scanner sc2 = new Scanner(System.in);
		System.out.println("���������Ĺ���");
		double d1 = sc2.nextDouble();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("��������������(����)");
		int a = sc3.nextInt();
		String d = String.format("%.2f", InterestRate(d1,a));
		System.out.println("���տ���ȡ��:"+d+"Ԫ");	
	}
	public static int HalfPrice(int x){
		int a = 0;
		if(x<1){
			System.out.println("��������������");
			
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