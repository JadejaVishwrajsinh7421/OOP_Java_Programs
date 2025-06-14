import java.util.Scanner;

public class A_3 {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);

		System.out.println("enter num1");
		double a= sc.nextDouble();
		System.out.println("enter num2");
		double b= sc.nextDouble();

		double ans=0;
		System.out.println("enter the operation +,-,*,/,");
		String opt=sc.nextLine();
		//switch case for opertaion
			Switch(opt){
			case"+":
				ans=a+b;
				break;
			case"-":
				ans=a-b;

				break;
			case"/":
				if(b!=0){
					ans=a/b;
				}
				else{
					System.out.println("error:In divsion");
					return;
				}
				break;
			case"*":
				ans=a*b;
				break;
			}	
			default:
				System.out.println("Invalid Operation")
				return;
		System.out.println("the result is"+ans);
	}
}