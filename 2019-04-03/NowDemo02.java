public class NowDemo02{
	public static void main(String[] args){
		//≥µ≈∆∫≈Œ Ã‚
		char[] ch = new char[4];
		int a = 0;
		int b = 0;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				ch[0] = (char)(i *1000);
				ch[1] = (char)(i *100);
				ch[2] = (char)(j *10);
				ch[3] = (char)j;
				a = ch[0]+ch[1]+ch[2]+ch[3];
				for(int k =0;k<100;k++){
					if(a == k*k && a !=0){
						System.out.println(a);
					}
				}	
			}
		}
	}
}