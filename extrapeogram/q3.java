import java.util.Scanner;

public class q3 {
    public static void main(String [] args){
        //to find a Factor of a given number 
        int num ;

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find the factor");
        num = sc.nextInt();

        for(int i=1 ; i<=num ; i++){
            if(num % i== 0){
                {
                    System.out.println("the factor of the number : "+ num  +"is :"+ i);
                }
                System.err.print("");
        }
     }
    sc.close();
    }

}
