//  Write a program to sort as per SPI from the List of students stored as ArrayList in 
// previous program. [C] 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

    public double getStudentSPI() {
        return studentSPI;
    }

    @Override
    public String toString() {
        return "StudentID: " + studentID +
               ", Name: " + studentName +
               ", RollNo: " + studentRollNo +
               ", SPI: " + studentSPI;
    }
}

public class StudentListSortDemo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding some students to the list
        students.add(new Student(101, "Alice", 1, 8.5));
        students.add(new Student(102, "Bob", 2, 7.8));
        students.add(new Student(103, "Charlie", 3, 9.0));
        students.add(new Student(104, "Diana", 4, 8.2));

        // Sort students by SPI in descending order
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // For descending order
                return Double.compare(s2.getStudentSPI(), s1.getStudentSPI());
            }
        });

        // Display sorted list
        System.out.println("Students sorted by SPI (descending):");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
