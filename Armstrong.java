package java;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int a=sc.nextInt();
    int count=0;
    int x=a;
    int y=a;
    while (a>0) {
    	count++;
    	a=a/10;
    }
   // System.out.println(count); //if needed
    int b=0;
    while(x>0) {
    	int c=x%10;
    	b+=Math.pow(c, count);
    	x=x/10;
    }
    if(y==b) {
    	System.out.println("Armstrong Number");
    }
    else {
    	System.out.println("Not an Armstrong Number");
    }
	}

}
