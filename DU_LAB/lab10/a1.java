// Write a program to demonstrate Arithmetic Exception and ArrayIndexOutOfBounds 
// Exception using try-catch block
import java.util.Scanner;

public class a1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter input num1");
        int inputnum1 = sc.nextInt();
        try{
        int n2 = inputnum1*inputnum1;
        
            int [] students = new int[4];
            for(int i=0;i<=students.length;i++){
                System.out.println("enter the marks of students");
                students[i] = sc.nextInt();
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("byee");
    }   

}
