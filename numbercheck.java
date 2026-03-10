package practice;
import java.util.Scanner;
public class number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		long a=sc.nextLong();
		int even=0,odd=0;
		while(a>0) {
			long b=a%10;
			if(b%2==0) {
				even+=b;
			}
			else {
				odd+=b;
			}
		}
		if(even==odd) {
			System.out.println("Good number! Select it");
		}
		else {
			System.out.println("Better luck next time!");
		}
		}

}
