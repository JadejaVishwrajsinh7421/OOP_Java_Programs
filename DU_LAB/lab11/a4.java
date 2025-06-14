// Write a java program that implements a multi-thread application that has 
// three threads. First thread generates random integer every 1 second and if 
// the value is even, second thread computes the square of the number and 
// prints. If the value is odd, the third thread will print the value of cube of 
// the number. 

class App implements Runnable{
    public void run(){
        while (true){
            try{
                int rad = (int)(Math.random()*100);
                if(rad % 2 == 0){
                   Even sq = new Even(rad);
                   Thread t2 =new Thread(sq);
                   t2.start();
                }
                else{
                    Odd cu = new Odd(rad);
                    Thread t3 = new Thread(cu);
                    t3.start();
                }
            }catch(Exception e){         
                System.err.println("error" +e.getMessage());
            }
        }
    }
}
class Even implements Runnable{
    int sqrt;
    Even(int rad){
         sqrt = rad * rad;;
    }
    public void run(){
        try{

            System.out.println("square num " +sqrt);
            Thread.sleep(1000);
        }catch(Exception e){
            System.err.println("error" +e.getMessage());
        }
    }
}
class Odd implements Runnable{
    int cub;
    Odd(int rad){
         cub = rad * rad * rad;
    }
    public void run(){
        try{
            System.out.println("cube num " +cub);
            Thread.sleep(1000);
        }catch(Exception e){
            System.err.println("error" +e.getMessage());
        }
    }
}public class a4 {
    public static void main(String []args){
        App a = new App();
        Thread m1 = new Thread(a);  
        m1.start();


        

    }
}
