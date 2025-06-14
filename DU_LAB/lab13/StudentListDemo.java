//  Write a program to demonstrate the use of ArrayList to store and display List of Student 
// class with StudentID, StudentName, StudentRollNo and StudentSPI. [C] 
import java.util.ArrayList;

class Student {
    private int studentID;
    private String studentName;
    private int studentRollNo;
    private double studentSPI;

    public Student(int studentID, String studentName, int studentRollNo, double studentSPI) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentRollNo = studentRollNo;
        this.studentSPI = studentSPI;
    }

    @Override
    public String toString() {
        return "StudentID: " + studentID +
               ", Name: " + studentName +
               ", RollNo: " + studentRollNo +
               ", SPI: " + studentSPI;
    }
}

public class StudentListDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding some students to the list
        students.add(new Student(101, "Alice", 1, 8.5));
        students.add(new Student(102, "Bob", 2, 7.8));
        students.add(new Student(103, "Charlie", 3, 9.0));
        students.add(new Student(104, "Diana", 4, 8.2));

        // Display all students
        System.out.println("List of Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
