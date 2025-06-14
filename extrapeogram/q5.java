import java.util.Scanner;

public class q5 {

    public static void main(String []args){
        //find a summation of a digit of a given number

        Scanner  sc = new Scanner(System.in);

        System.out.println("enter num for its summation of digits");
        int num = sc.nextInt();
        int sum=0;
        while(num>0){
            sum = sum + num%10;
            num = num/10;
            
        }
        System.out.println("find a summation of a digit of a given number"+sum);
        
    } 
}
