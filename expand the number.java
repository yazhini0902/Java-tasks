package practice;
import java.util.Scanner;
public class expand {

	public static void main(String[] args) {
		int a=1234;
		int b=(a/1000)%10;
		int c=(a/100)%10;
		int d=(a/10)%10;
		int e=a%10;
		System.out.println(b*1000+"+"+c*100+"+"+d*10+"+"+e);
  }
}
