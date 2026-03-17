package first;
import java.util.Scanner;
public class lottery {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your seven digit Ticket ID:");
		long a=sc.nextInt();
		System.out.println("Enter the code:");
		int b=sc.nextInt();
		int count=0;
		while(a>0) {
			int digit=(int)(a%10);
			if(digit==b) {
				count ++;
			}
			a=a/10;
		}
		if(count==0) {
			System.out.println("Congratulations!!Lucky Ticket");
		}
		else if(count>3) {
			System.out.println("Partially Lucky");
		}
		else
		{
			System.out.println("Unlucky Ticket:(");
		}

	}

}
