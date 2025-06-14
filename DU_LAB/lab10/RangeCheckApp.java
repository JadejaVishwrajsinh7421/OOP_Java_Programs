import java.util.Scanner;

// Custom Exception Class
class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message);
    }
}

public class RangeCheckApp {
    // Method to check number and display square
    static void checkNumber(int num) throws OutOfRangeException {
        if (num < 10 || num > 50) {
            throw new OutOfRangeException("Number is out of range! Enter between 10 and 50.");
        } else {
            System.out.println("Square of " + num + " is: " + (num * num));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 10 and 50: ");
        
        try {
            int number = scanner.nextInt();
            checkNumber(number);
        } catch (OutOfRangeException e) {
            System.out.println("Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            System.out.println("Program finished.");
        }

        scanner.close();
    }
}
