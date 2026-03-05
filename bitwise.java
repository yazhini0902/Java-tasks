package task;
import java.util.Scanner;
class swapping{
	private int a,b;
	swapping(int a,int b){
		this.a=a;
		this.b=b;
	}
	void swap() {
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("Swapped numbers are:"+ a+" "+ b);
		}
		
	}
public class bitwise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value:");
		int b=sc.nextInt();
		swapping s=new swapping(a, b);
		s.swap();
		}
}
