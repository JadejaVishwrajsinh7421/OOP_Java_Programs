import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
         
 // 2 WAP to find whether string is palindrome or not. 

        String str ;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the stroing");
        str = sc.nextLine();
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
}
