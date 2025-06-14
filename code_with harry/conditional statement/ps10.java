import java.util.Scanner;

public class ps10 {
    public static void main(String[] args) {
        // calculator
        Scanner  sc = new Scanner(System.in);

        System.out.println("enter num 1");
        double num1 = sc.nextDouble();

        System.out.println("enter num 2");
        double num2 = sc.nextDouble();

        System.out.println("enter operator\n 1.addition\n2.subtraction\n3.multiply\n4.division");
        int operator = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println("addition of "+ num1 + "and "+num2+ "is"+(num1+num2));
                break;
            case 2:
                System.out.println("subtraction of "+ num1 + "and "+num2+ "is"+(num1-num2));
                break;  
            case 3: 
                System.out.println("multiplication of "+ num1 + "and "+num2+ "is"+(num1*num2));
                break;
            case 4:
                if(num2 == 0){
                    System.out.println("division by zero is not possible");
                }
                else{
                    System.out.println("division of "+ num1 + "and "+num2+ "is"+(num1/num2));
                }
                break;
            default:
                System.out.println("invalid operator");
                break;
        }


    }
}
