import java.io.*;
import java.util.*;

class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Parse from CSV line: id,name,age
    public static Student fromCSV(String line) {
        String[] parts = line.split(",");
        int id = Integer.parseInt(parts[0].trim());
        String name = parts[1].trim();
        int age = Integer.parseInt(parts[2].trim());
        return new Student(id, name, age);
    }

    // Convert to CSV line
    public String toCSV() {
        return id + "," + name + "," + age;
    }

    @Override
    public String toString() {
        return "Student[ID=" + id + ", Name=" + name + ", Age=" + age + "]";
    }
}

public class StudentManagerBuffered {
    private static final String FILE_NAME = "students.txt";

    // Load students from text file
    public static List<Student> loadStudents() {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    students.add(Student.fromCSV(line));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Student data file not found. Starting with empty list.");
        } catch (IOException e) {
            System.out.println("Error reading student data: " + e.getMessage());
        }

        return students;
    }

    // Save students to text file
    public static void saveStudents(List<Student> students) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Student s : students) {
                bw.write(s.toCSV());
                bw.newLine();
            }
            System.out.println("Students saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving students: " + e.getMessage());
        }
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
