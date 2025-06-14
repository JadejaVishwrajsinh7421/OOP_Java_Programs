import java.util.Scanner;
import java.lang.Math;  

public class ps04 {
    public static void main(String [] args){
        // check wheter the num is int or not 

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        double num = sc.nextDouble();
        //System.out.println(b1);
        if(Math.round (num) == num){
            System.out.println("num is int ");
        }
        else{
            System.out.println("num is not int");
        }
        
        

    }
}
