public class ps28 {
    public static void main(String [] args){
        // Butterfly pattern

        int n=4;
        for (int i=1 ;i<=n;i++){
            // stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space
            for(int j=1 ;j<=2*(n-i);j++){
                System.out.println("");
            }
            // stars2
            for(int j=n;j>=1;j--){
                System.out.print("*");
            }
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // space
            for(int j=1 ;j<=2*(n-i);j++){
                System.out.println("");
            }
            // stars2
            for(int j=n;j>=1;j--){
                System.out.print("*");
            }
        }
    }
}
