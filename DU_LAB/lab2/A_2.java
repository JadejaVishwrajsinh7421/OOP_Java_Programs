import java.util.Scanner;

public class A_2{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter length of rectangle");
		int l= sc.nextInt();

		System.out.println("enter width of rectangle");
		int w= sc.nextInt();

		int area=l*w;
		System.out.println("area of rectangle is "+area);
	}
}