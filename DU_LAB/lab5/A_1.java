import java.util.Scanner;

public class A_1{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);

		System.out.print("Enter a string: ");
		String  str = sc.nextLine();

		for (int i = 1; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }



	}
}