
// Refine the student manager program to manipulate the student information from files 
// by using the DataInputStream and DataOutputStream. Assume suitable data. [C] 
import java.io.*;
import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;

    public Student() {}

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void write(DataOutputStream dos) throws IOException {
        dos.writeInt(id);
        dos.writeUTF(name);
        dos.writeInt(age);
    }

    public void read(DataInputStream dis) throws IOException {
        id = dis.readInt();
        name = dis.readUTF();
        age = dis.readInt();
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + ", Age=" + age + "]";
    }
}

public class StudentManagerDataStream {
    private static final String FILE_NAME = "students.dat";

    // Save list of students to binary file
    public static void saveStudents(List<Student> students) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_NAME))) {
            dos.writeInt(students.size()); // write number of students first
            for (Student s : students) {
                s.write(dos);
            }
            System.out.println("Students saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
    }

    // Load list of students from binary file
    public static List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();
        try (DataInputStream dis = new DataInputStream(new FileInputStream(FILE_NAME))) {
            int count = dis.readInt(); // read number of students
            for (int i = 0; i < count; i++) {
                Student s = new Student();
                s.read(dis);
                students.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No saved student data found. Starting fresh.");
        } catch (IOException e) {
            System.out.println("Error reading students: " + e.getMessage());
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
