// Write a program to check that whether the name given from command line is file or 
// not? If it is a file then print the size of file and if it is directory then it should display the 
// name of all files in it. [B] 
import java.io.File;

public class FileOrDirectoryChecker {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a file or directory name as a command-line argument.");
            return;
        }

        String path = args[0];
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("The path \"" + path + "\" does not exist.");
            return;
        }

        if (file.isFile()) {
            System.out.println("\"" + path + "\" is a file.");
            System.out.println("Size: " + file.length() + " bytes");
        } else if (file.isDirectory()) {
            System.out.println("\"" + path + "\" is a directory.");
            String[] contents = file.list();
            if (contents != null && contents.length > 0) {
                System.out.println("Contents:");
                for (String name : contents) {
                    System.out.println(name);
                }
            } else {
                System.out.println("Directory is empty.");
            }
        } else {
            System.out.println("\"" + path + "\" is neither a file nor a directory.");
        }
    }
}
