import java.util.Scanner;

// Thread to calculate sum of one row
class RowSumThread extends Thread {
    private int[] row;
    private int rowIndex;

    public RowSumThread(int[] row, int rowIndex) {
        this.row = row;
        this.rowIndex = rowIndex;
    }

    public void run() {
        int sum = 0;
        for (int val : row) {
            sum += val;
        }
        System.out.println("Sum of row " + rowIndex + ": " + sum);
    }
}

public class MatrixRowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Read matrix [A] m x n
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();

        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++) {
            System.out.println("Enter " + n + " elements for row " + i + ":");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // b. Create m threads
        RowSumThread[] threads = new RowSumThread[m];

        for (int i = 0; i < m; i++) {
            threads[i] = new RowSumThread(matrix[i], i);
            threads[i].start();  // c. Start each thread
        }

        // Ensure all threads finish before exiting main
        for (int i = 0; i < m; i++) {
            try {
                threads[i].join();  // wait for each thread to complete
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }

        System.out.println("All threads completed. Matrix row sums calculated.");
        sc.close();
    }
}
