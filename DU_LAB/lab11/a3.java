// Write a program to create two threads, one thread will print odd numbers and second 
// thread will print even numbers between 1 to 20 numbers.

class Odd extends Thread{
    public void run(){
        try{
        for(int i=1;i<=20;i+=2){
            System.out.println(i);
                Thread.sleep(50);
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
}

class Even extends Thread {
    public void run() {
        try {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
                Thread.sleep(100); 
               
            }
        } catch (Exception e) { 
            e.printStackTrace();
        }
        
    }
}

public class a3 {
    public static void main (String[] args) {
        Even e = new Even();
        Odd o = new Odd();
        e.start();
        o.start();
    }
}
