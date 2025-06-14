import java.util.Scanner;

public class ps03 {
    public static void main(String [] args){
        //kilo to miles and meters

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the distance in km");
        int  km = sc.nextInt();

        double miles = (km* 0.621371;

        double meter = km *1000;

        System.out.println("distance in miles is " +miles);
        System.out.println("distance in meters is " +meter);
    }
}
