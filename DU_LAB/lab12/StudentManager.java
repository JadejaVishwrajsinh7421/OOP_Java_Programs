import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Student class - implements Serializable to allow object serialization
class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + ", Age=" + age + "]";
    }
}

public class StudentManager {
    private static final String FILE_NAME = "students.dat";

    // Write list of students to file
    public static void saveStudents(List<Student> students) {
        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(students);
            System.out.println("Students saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    // Read list of students from file
    @SuppressWarnings("unchecked")
    public static List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();

        try (FileInputStream fis = new FileInputStream(FILE_NAME);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            students = (List<Student>) ois.readObject();

        } catch (FileNotFoundException e) {
            System.out.println("No saved student data found.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading students: " + e.getMessage());
        }

        return students;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> students = loadStudents();

        while (true) {
            System.out.println("\nStudent Manager");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Save & Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Student Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    students.add(new Student(id, name, age));
                    System.out.println("Student added.");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No students found.");
                    } else {
                        System.out.println("List of Students:");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }
                    break;

                case 3:
                    saveStudents(students);
                    sc.close();
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
