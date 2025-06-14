import java.util.Scanner;

public class OddAndEven{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num to check odd or even:");
		int a = sc.nextInt();
		if(a%2 == 0){
			System.out.println("it is even "+a);
		}
		else{
		System.out.println("it is odd: "+a);
		}
	}
}