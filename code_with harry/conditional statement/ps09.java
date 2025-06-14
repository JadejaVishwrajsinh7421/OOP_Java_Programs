import java.util.Scanner;

public class ps09 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1 for hindi");
        System.out.println("2 for gujarati");
        System.out.println("3 for english");
        
        System.out.println("enter button for lanaguage");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("namste bhai");
                break;
            case 2:
                System.out.println("kem cho mota bhai");
                break;
            case 3:
                System.out.println("hi brother");
                break;
            default:
                System.out.println("invaild input");
                break;
        }

    }
}
