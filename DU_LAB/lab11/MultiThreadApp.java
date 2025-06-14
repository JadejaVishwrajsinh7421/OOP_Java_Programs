import java.util.Random;

// Thread 1: Generates random number
class NumberGenerator extends Thread {
    public void run() {
        Random rand = new Random();

        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100); // generates a number from 0 to 99
            System.out.println("\nGenerated Number: " + num);

            if (num % 2 == 0) {
                new Square(num).start(); // if even
            } else {
                new Cube(num).start(); // if odd
            }

            try {
                Thread.sleep(1000); // wait for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Thread 2: Computes square
class Square extends Thread {
    private int number;

    Square(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

// Thread 3: Computes cube
class Cube extends Thread {
    private int number;

    Cube(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

// Main class
public class MultiThreadApp {
    public static void main(String[] args) {
        NumberGenerator gen = new NumberGenerator();
        gen.start(); // start the generator thread
    }
}
