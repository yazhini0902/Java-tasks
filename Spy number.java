package javanew;
import java.util.Scanner;
public class array
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		int addition=add(a);
		int multiplication=mul(a);
		if (multiplication==addition) {
			System.out.println("Spy number");
		}
		else {
			System.out.println("Not a spy number");
		}
	}
	static int add(int x)
	{
		int b=0;
		while(x>0)
		{
			int c=x%10;
			b=b+c;
			x=x/10;
		}
		return b;
	}
	static int mul(int y)
	{
		int b=1;
		while(y>0)
		{
			int c=y%10;
			b=b*c;
			y=y/10;
		}
		return b;
	}
