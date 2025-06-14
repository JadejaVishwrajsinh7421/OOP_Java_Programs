import java.util.Scanner;

class student{
    String name;
    int roll_no;
    double spi;
    String course;
    public student(){
        this.name="";
        this.roll_no=-1;
        this.spi=-1;
        this.course="";

    }
    public student( String name, int roll_no,double spi,String course){
        this.name =name;
        this.roll_no=roll_no;
        this.spi=spi;
        this.course=course;
    }
}
void getter(){

    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter the details of s1");

    System.out.println("enter the name of s1");
    this.name = sc.nextLine();

    System.out.println("enter the name of roll no");
    this.roll_no = sc.nextInt();

    System.out.println("enter the name of s1");
    this.spi = sc.nextDouble();

    System.out.println("enter the name of s1");
    this.course = sc.nextLine();

}
public class extra1{
    public static void main(String[] args){
        
        student s1 = new student();
        student s2 = new Student();

        s1.getter();
    }
}