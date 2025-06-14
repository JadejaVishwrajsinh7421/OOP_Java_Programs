// Write a program of writing binary file using multithreading. Demonstrate use of join() 
// and yield() interrupt(). [A] 
import java.io.*;

class BinaryFileWriter extends Thread {
    private int[] data;
    private String filename;

    public BinaryFileWriter(int[] data, String filename) {
        this.data = data;
        this.filename = filename;
    }

    @Override
    public void run() {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            for (int i = 0; i < data.length; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Writer thread interrupted. Stopping write operation.");
                    return;
                }

                dos.writeInt(data[i]);
                System.out.println("Written: " + data[i]);

                // Yield after writing half the data
                if (i == data.length / 2) {
                    System.out.println("Writer thread yielding...");
                    Thread.yield();
                }

                // Sleep a little to simulate longer writing
                Thread.sleep(100);
            }
        } catch (IOException e) {
            System.out.println("IOException in writer thread: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Writer thread interrupted during sleep.");
        }
    }
}

class BinaryFileReader extends Thread {
    private String filename;

    public BinaryFileReader(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            System.out.println("Reader thread started reading file...");
            while (true) {
                int value = dis.readInt();
                System.out.println("Read: " + value);
            }
        } catch (EOFException e) {
            System.out.println("End of file reached.");
        } catch (IOException e) {
            System.out.println("IOException in reader thread: " + e.getMessage());
        }
    }
}

public class BinaryFileMultithreadDemo {
    public static void main(String[] args) {
        int[] numbersToWrite = {10, 20, 30, 40, 50, 60, 70, 80};
        String filename = "data.bin";

        BinaryFileWriter writerThread = new BinaryFileWriter(numbersToWrite, filename);
        BinaryFileReader readerThread = new BinaryFileReader(filename);

        writerThread.start();

        // Interrupt writer thread after 500ms to demonstrate interrupt()
        new Thread(() -> {
            try {
                Thread.sleep(500);
                System.out.println("Main thread interrupting writer thread...");
                writerThread.interrupt();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        try {
            // Wait for writer to finish
            writerThread.join();
            System.out.println("Writer thread finished. Starting reader thread...");
            readerThread.start();

            // Wait for reader to finish reading
            readerThread.join();

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
    }
}
