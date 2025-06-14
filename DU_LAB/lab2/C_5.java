import java.util.Scanner;

public class C_5{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);

	System.out.println("enter num1");
	int a = sc.nextInt();
	System.out.println("enter num2");
	int b = sc.nextInt();
	System.out.println("enter num3");
	int c = sc.nextInt();

		if(a>b){
			if(a>c){
				System.out.println("the largest no is "+a);
			}
			else{
				System.out.println("the largest no is "+c);
			}
		}
		else{
			if(b>c){
				System.out.println("the largest no is "+b);
			}
			else{
				System.out.println("the largest no is "+c);
			}
		}


	}
}