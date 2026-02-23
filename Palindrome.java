import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=0;
		int x=a;
		while(a<0)
		{
			int c=a%10;
			b=b*10+c;
			a=a/10;
		}
		if (x==b)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
