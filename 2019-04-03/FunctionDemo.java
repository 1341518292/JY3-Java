public class FunctionDemo{
	public static void main(String[] args){
		int a =  f(3);
		System.out.println(a);
		fGet();
		FunctionDemo fun = new FunctionDemo();
		fun.fGet();
	}
	public static int f(int x){
		return x * x; 
	
	}
	public static void fGet(){
		System.out.println("ÄªµÃ");
	}
}