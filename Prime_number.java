import java.util.Scanner;
public class prime_no {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=a) {
			if(a%1==0)
			{
				count++;
			}
			i++;
		}
		if (count==2)
		{
			System.out.println("Prime number");
		}
		else {
			System.out.println("Not a prime number");
		}
	}
