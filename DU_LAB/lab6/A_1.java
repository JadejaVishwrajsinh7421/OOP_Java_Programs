package lab6;

import java.util.Scanner;

class Area{
    double radius=0.0;
 
    public Area(double radius){
        // parameter constructour
        this.radius=radius;
    }
    public double AreaCircle(){
        return Math.PI*radius*radius;
    }
} 

public class A_1 {
    public static void main( String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter radius");
        double radius = sc.nextDouble();
        Area c = new Area(radius);
        System.out.println("the area of circle is"+c.AreaCircle());
    }
}
