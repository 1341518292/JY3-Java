public class Demo02{
	public static void main(String[] args){
		String sum0 ="692116851128";
		int sum1 =0;
		int sum2 =0;
		for(int i =0;i<12;i++){
			if(i%2 == 0){
			//拿到奇数位
			int c1 = sum0.charAt(i) - 48;
			 sum1 +=c1;
			 
			}
			else{
			//拿到偶数位
			int c2 = sum0.charAt(i) - 48;
			 sum2 +=c2;
			}
		}
		System.out.println(sum1);
		
		int sum3 = (10-((sum1+(sum2 * 3))%10))%10;
		System.out.println("校验码:"+sum3);
		//--------------------------------------------------
		//利用数组做
		int[] num1 = {6,9,2,1,1,6,8,5,1,1,2,8};
		int num2 =0;
		int num3 =0;
		for(int i =0;i<num1.length;i++){
			if(i%2 == 0){
			//拿到奇数位的和			
			 num2 += num1[i];			 
			}
			else{
			//拿到偶数位的和			
			 num3 += num1[i];
			}
		}
		System.out.println(num2);
		int num4 = (10-((num2+(num3 * 3))%10))%10;
		System.out.println("校验码:"+num4);
		//--------------------------------------------------
		int y1  = f1(10);
		int y2  = f2(1);
		System.out.println(y1);
		System.out.println(y2);
	}
	public static int f1(int x){
		return x%3;
	}
	public static int f2(int x){
		return x++;
	}
}