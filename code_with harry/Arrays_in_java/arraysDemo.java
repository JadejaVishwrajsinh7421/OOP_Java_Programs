public class arraysDemo {
    public static void main(String[] args) {

        // Declaration
        int[] arr1;

        // Allocation
        arr1 = new int[5]; // size 5, all elements 0 by default

        // Declaration + Allocation together
        int[] arr2 = new int[5];

        // Initialization
        arr2[0] = 10;
        arr2[1] = 20;

        // Declaration + Initialization together
        int[] arr3= { 10, 20, 30, 40, 50 };
        // not need to give the size it direct get from elements 

        System.out.println(arr1[0]);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        for(int i=0 ;i<arr3.length ;i++){
            System.out.println(arr3[i]);
        }
    }
}