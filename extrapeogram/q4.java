import java.util.Scanner;

public class q4 {
    //find a factorial of a given integer
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num to find factorial");
        Double num = sc.nextDouble();

        double fact=1;

        for( double i=1;i<=num;i++){
            fact = fact *i;
        }
        System.out.println("the factorial of the number is : "+ fact);
        sc.close();
    }
}
