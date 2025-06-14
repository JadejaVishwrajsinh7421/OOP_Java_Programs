import java.util.Scanner;

public class ps01 {
    // write a prog to find sum of three no

    public static void main(String [] args){
        Scanner c = new Scanner(System.in);
        System.out.println("no 1");
        int a = c.nextInt();

        System.out.println("no 2");
        int b = c.nextInt();

        System.out.println("no 3");
        int d = c.nextInt();

        int sum = a+b+d;
        
        System.out.println("sum of 3 no is " +a + "+" +b + "+" +d + "=" +sum);
        
    }
}
