import java.util.Random;
public class Demo{
	public static void main(String[] args)
	{
    Random r = new Random();
    int rInt = r.nextInt(58);  //产生一个随机数[0,58);
    System.out.println(rInt);
    char c = (char)('A' + rInt);
    System.out.println(c);
	}
	}