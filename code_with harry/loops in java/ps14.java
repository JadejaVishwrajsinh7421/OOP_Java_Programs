import java.util.Scanner;

public class ps14 {
    public static void main(String[] args){
        // print table of n 
        Scanner sc = new Scanner(System.in);

        System.out.println(("enter the number"));
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n +"*"+ i+ "="+ n*i);
        }
        
    }
}
