import java.util.Scanner;

public class LeapYear{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter year to check leap year or not ");
		int a=sc.nextInt();
		if((a % 400 == 0 && a % 4 == 0)||(a % 100 !=0)){
			System.out.println("the year is leap year"+a);
			}
		else{
			System.out.println("the year is not leap year"+a);
		}
	}
}