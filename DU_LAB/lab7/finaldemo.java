import java.util.Scanner;

final class fd{
    final double  d =12;
    final void demomethod(){
        System.out.println("Call the final method in main method");
    }

} 
class base extends fd{
    // void demomethod(){
    //     System.out.println("called final class in child class");
    // }
}

public class finaldemo{
    public static void main(String[] args){
        fd obj1 = new fd();
        // obj1.d =23;
        
    }
}