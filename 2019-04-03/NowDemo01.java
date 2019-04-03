public class NowDemo01{
	public static void main(String[] args){
		int i = 1;
		int sum = 0;
		while(i<=100){
		sum += i;
		i++;
		}
		System.out.println(sum);
		int a =0;
		int c =0;
		do{
			--c;
			a= a -1;

		}while(a>0);
		System.out.println(c);
		for(int e =0;e<5;e++){
			for(int t=4;t>e;t--){	
				System.out.print(" ");
			}
			for(int r=0;r<e*2+1;r++){	
				System.out.print("*");
			}
			
			System.out.println();
		}
		int z = 1;
		boolean b = 3+4>4 || 5!=6 && 7 > 8+ ++z;
		System.out.println(b);
	}
}