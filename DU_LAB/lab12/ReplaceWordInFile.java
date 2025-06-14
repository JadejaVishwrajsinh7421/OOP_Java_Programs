import java.io.*;

public class ReplaceWordInFile {
    public static void main(String[] args) {
        String inputFile = "file1.txt";  // Input file name
        String outputFile = "file2.txt"; // Output file name
        String wordToReplace = "word1";
        String replacementWord = "word2";

        int replacementCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {

            String line;

            while ((line = br.readLine()) != null) {
                // Count occurrences of wordToReplace in the line
                int count = countOccurrences(line, wordToReplace);

                // Replace word1 with word2
                String modifiedLine = line.replace(wordToReplace, replacementWord);

                replacementCount += count;

                // Write modified line to output file
                bw.write(modifiedLine);
                bw.newLine();
            }

            System.out.println("Replacement completed.");
            System.out.println("Number of replacements: " + replacementCount);

        } catch (FileNotFoundException e) {
            System.out.println("Input file not found: " + inputFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    // Helper method to count occurrences of a word in a string
    private static int countOccurrences(String line, String word) {
        int count = 0;
        int index = 0;

        while ((index = line.indexOf(word, index)) != -1) {
            count++;
            index += word.length();
        }

        return count;
    }
}
