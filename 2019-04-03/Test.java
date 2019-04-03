import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        
		Scanner sc = new Scanner(System.in);
        String str = sc.next();
		int a = Integer.parseInt(str);
        int b  = a * a;
		System.out.println(b);
    }
}