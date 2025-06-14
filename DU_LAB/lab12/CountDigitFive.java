import java.io.*;

public class CountDigitFive {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java CountDigitFive <filename>");
            return;
        }

        String filename = args[0];
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            int ch;
            while ((ch = br.read()) != -1) {
                if ((char) ch == '5') {
                    count++;
                }
            }
            System.out.println("Number of occurrences of digit '5': " + count);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
// for run 
// javac CountDigitFive.java
// java CountDigitFive input.txt