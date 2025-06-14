import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileCounter {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = inputScanner.nextLine();

        File file = new File(filePath);
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                lineCount++;

                charCount += line.length();
                String[] words = line.trim().split("\\s+"); // split by spaces/tabs

                // Handle case when line is empty
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            System.out.println("\nFile Analysis:");
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        inputScanner.close();
    }
}

