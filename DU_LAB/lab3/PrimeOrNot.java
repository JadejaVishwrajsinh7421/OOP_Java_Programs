import java.util.Scanner;

public class PrimeOrNot{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
		int a = sc.nextInt();
		int count=0;
		for(int i=1;i<=a/2;i++){
			if(a%i==0){
				count++;
			}

		}
		if(count==0){
			System.out.println("the no is prime"+a);
		}
		else{			
			System.out.println("the no is prime"+a);
		}	
	}
}