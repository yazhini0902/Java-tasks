package array;
import java.util.Scanner;
public class array {
	int search(int b[],int key) {
		for (int i=0;i<b.length;i++) 
		{
			if(key==b[i]) {
				return i;
			}
			}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array elements:");
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter the array elements:");
		for (int i=0;i<size;i++) {
			b[i]=sc.nextInt();
		}
		System.out.println("array elements are:");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("Enter the key element:");
		int key=sc.nextInt();
		array s=new array();
		int x=s.search(b, key);
		if(x==-1) {
			System.out.println("Element not found!");
		}
		else
		{
			System.out.println("Element found!"+x);a
		}
		}
