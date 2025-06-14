import java.util.Scanner;

public class A_1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);

		System.out.println("enter size of array");
		int n = sc.nextInt();

		int total=0;
		int []arr = new int[n];
		for(int i=0;i<n;i++){
			System.out.println("enter num in array");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			total =total+arr[i];
		}
		System.out.println("the sum is "+total);
		double avg =(double)total/n;
		System.out.println("the avg is "+avg);
	}
}