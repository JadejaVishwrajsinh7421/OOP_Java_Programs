import java.util.*;

public class C_3 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter a size of array");
        int n=sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter elements");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for( int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("enter target");
        int k=sc.nextInt();

        int high=arr[n];
    }
}
