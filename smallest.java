package ternary;
import java.util.Scanner;
class oops{
	private int a,b,c;
	oops(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void small() {
		if (a==b && b==c) {
			System.out.println("All values are equal!");
		}
		else {
		int d=a<b?a:b;
		int e=d<c?d:c;
		System.out.println("Smallest number is "+e);
		}
		
	}
}
public class operator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value:");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd value:");
		int c=sc.nextInt();
		oops o=new oops(a, b, c);
		o.small();
		}
}
