package practice2;
import java.util.Scanner;
public class addition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word:");
		String a=sc.next();
		String rev="";
		String low=a.toLowerCase();
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
			}
		System.out.println("Reversed String:"+rev);

		for(int i=0;i<low.length();i++) {
			char ch=low.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.print(ch+" ");
			}
		}
  }
}
