package newone;
import java.util.Scanner;
class palindrome{
	private int a;
	private static int b;
	private static int x;
	palindrome(int a){
		this.a=a;
		this.b=b;
		this.x=a;
	}
	void rev() {
		while (a>0) {
			int c=a%10;
			b=b*10+c;
			a=a/10;
		}
		System.out.println(b);
		if(x==b) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not a palindrome number");
		}
	}
}
public class oops {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		int a=sc.nextInt();
		palindrome p=new palindrome(a);
		p.rev();
	
		}
}
