// Custom Exception Class
class DarshanUniException extends Exception {
    public DarshanUniException(String message) {
        super(message);
    }
}

// Main class
public class UniversityApp {
    // Method that throws the custom exception
    static void checkStudentEligibility(int marks) throws DarshanUniException {
        if (marks < 40) {
            throw new DarshanUniException("Not eligible! Marks below passing criteria for Darshan University.");
        } else {
            System.out.println("Eligible: Student has passed with " + marks + " marks.");
        }
    }

    public static void main(String[] args) {
        int studentMarks = 35; // Change this to test

        try {
            checkStudentEligibility(studentMarks);
        } catch (DarshanUniException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
