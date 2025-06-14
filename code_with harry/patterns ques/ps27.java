public class ps27 {
    public static void main(String [] args){
        
        for(int i=1;i<=5;i++){
            // space
            for(int j=1; j<=5-i;j++){
                System.out.println();
            }
            // 1st part
            for(int j=i;j>=i;j--){
                System.out.print(j);
            }
            // 2nd
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
