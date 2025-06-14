import java.util.Scanner;
public class max3{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter no 1");
		int a= sc.nextInt();
		System.out.println("enter no 2");
		int b= sc.nextInt();
		System.out.println("enter no 3");
		int c= sc.nextInt();

		int max=(a>b)?((a>c)?(a):(c)): ((b>c)?(b):(c));
		System.out.println("max no is"+max);
	}
}		