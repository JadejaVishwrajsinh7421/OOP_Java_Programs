
import java.util.Scanner;

public class palindrome{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
		int a=sc.nextInt();

		int b=a;
		int rev=0;
		int x=0;
	
		while(a!=0){
			rev=(rev*10)+(a%10);
			a=a/10;
		}
		if(rev==b){
			System.out.println("the num is palindrome"+b);
		}
		else{
			System.out.println("the num is not  palindrome"+b);

		}

	}
}