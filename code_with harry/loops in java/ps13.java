import java.util.Scanner;

public class ps13 {
    public static void main(String[] args){
        // print the sum of n number

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num");
        int n = sc.nextInt();
        int sum =0;
        for(int i= 1;i<=n;i++){
            
            sum +=i;
        }
        System.out.println("sum is :"+sum);
    }   
}
