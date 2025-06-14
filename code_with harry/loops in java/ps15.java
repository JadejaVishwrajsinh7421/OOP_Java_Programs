import java.util.Scanner;

public class ps15 {
    public static void main(String[] args){
        // Print all even numbers till n.
        Scanner  v = new Scanner(System.in);

        System.out.println("enter the number");
        int n= v.nextInt();

        for(int i=1;i<=n;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }

        //q-2
        // for(; ;) {
        //     System.out.println("Apna College");
        // }

    }
}
