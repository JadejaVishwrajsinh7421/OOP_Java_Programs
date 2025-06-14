class Buffer {
    private int data;
    private boolean isEmpty = true;

    public synchronized void produce(int value) {
        while (!isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        data = value;
        System.out.println("Produced: " + data);
        isEmpty = false;
        notify();
    }

    public synchronized int consume() {
        while (isEmpty) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        System.out.println("Consumed: " + data);
        isEmpty = true;
        notify();
        return data;
    }
}

class Producer extends Thread {
    private Buffer buffer;

    public Producer(Buffer b) { this.buffer = b; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.produce(i);
        }
    }
}

class Consumer extends Thread {
    private Buffer buffer;

    public Consumer(Buffer b) { this.buffer = b; }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            buffer.consume();
        }
    }
}

public class PC_WaitNotify {
    public static void main(String[] args) {
        Buffer buf = new Buffer();
        new Producer(buf).start();
        new Consumer(buf).start();
    }
}
