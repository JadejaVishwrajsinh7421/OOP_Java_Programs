import java.util.Scanner;

public class ps08 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter num1");
        int num1= sc.nextInt();

        System.out.println("enter num2");
        int num2 = sc.nextInt();

        // method 1

        //if(num1 != num2){
        //    if(num1>num2){
          //      System.out.println("num1 is greater");
            //}
        //    else{
        //        System.out.println("num2 is greater");
        //    }
        //}
        //else{
        //    System.out.println("both are equal");
        //}

        //method2

        if(num1 == num2){
            System.out.println("both are equal");
        }
        else if(num1>num2){
            System.out.println("num1 is greater");
        }
        else{
            System.out.println("num2 is greater");
        }



    }
}
