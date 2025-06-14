import java.util.Scanner;

public class B_4{
	public static void main(String[]args){

		Scanner sc=new Scanner(System.in);
		System.out.println("enter temp in fahrenheit");
		double f=sc.nextdouble();
		double g=(((f-32)*5)/9);
		System.out.println("the same temperature in celsisus:"+g);

	}
}