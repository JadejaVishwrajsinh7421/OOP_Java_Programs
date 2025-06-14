// Thread by implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("From MyRunnable: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        t1.start(); // start the thread

        for (int i = 1; i <= 5; i++) {
            System.out.println("From main thread: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}


// by thread class
// class MyThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 5; i++) {
//             System.out.println("From MyThread: " + i);
//             try {
//                 Thread.sleep(500); // sleep for half a second
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class ThreadDemo {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.start(); // start the thread

//         for (int i = 1; i <= 5; i++) {
//             System.out.println("From main thread: " + i);
//             try {
//                 Thread.sleep(500);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }
