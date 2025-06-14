import java.util.Scanner;
public class Result{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks of 5 subjects");
		System.out.println("enter marks of maths");
		int maths = sc.nextInt();
		System.out.println("enter marks of english");
		int eng = sc.nextInt();
		System.out.println("enter marks of physics");
		int physics = sc.nextInt();
		System.out.println("enter marks of cpc");
		int cpc = sc.nextInt();
		System.out.println("enter marks of java");
		int java = sc.nextInt();
		
		double percentage = (maths+eng+physics+cpc+java)/5.0;	
		System.out.println("the percentage " +percentage); 

		if(percentage>=60){
			System.out.println("first division");
		}
		else if(percentage>=50){
			System.out.println("second division");
		}
		else if(percentage>=49){
			System.out.println("third division");
		}else if(percentage<40){
			System.out.println("fail");
		}

	}
}


