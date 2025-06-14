class Message1 implements Runnable{
    public void run(){
        try{
            for(int i=0; i<=6; i++){
                System.out.println("good morning");
                Thread.sleep(1000);
            }
        }catch(Exception e){
        System.err.println("error" +e.getMessage());
        }
    }
}

class Message2 implements Runnable{
    public void run(){
        try{
            for(int i=0; i<=6; i++){
                System.out.println("good Afternoon");
                Thread.sleep(3000);
            }
        }catch(Exception e){
        System.err.println("error" +e.getMessage());
        }
    }
}

public class a2 {
    public static void main(String[] args) {
        Message1 m1 = new Message1();    
        Thread t = new Thread(m1);
        t.start();

        Message2 m2 = new Message2();
        t = new Thread(m2);
        t.start();
        // by annyonums method to start Thread
        // Thread t = new Thread(new Message1());
    }
}
