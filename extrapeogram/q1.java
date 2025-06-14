import java.util.Scanner;

public class q1 {
    public static void main (String [] args){
        //to find a sum of even number into 1D array. 
        int sum = 0;
        int i =0;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the no of elements in ");
        int n = sc. nextInt();
        int [] arr = new int[n];

        System.out.println("enter the elements in array");
        for(i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(i=0; i<n; i++){
            if(arr[i] % 2 == 0){
                sum = sum + arr[i];
            }
        }    
        //print arr

        for(i=0; i<n; i++){
            System.out.println("the elements in array are " + arr[i]);
        }

        
        System.out.println("the sum of even elements in array is " + sum);
    }
}
