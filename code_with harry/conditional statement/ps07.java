import java.util.Scanner;

public class ps07 {
    public static void main(String[] args) {
        //odd and even
        Scanner sc = new Scanner(System.in);

        System.out.println("enter num");
        int num= sc.nextInt();

        if(num%2==0){
            System.out.println("num is even");
        }
        else{
            System.out.println("num is odd");
        }
    }
}
