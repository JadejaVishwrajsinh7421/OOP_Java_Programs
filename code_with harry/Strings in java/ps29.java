import java.util.Scanner;
import java.lang.*;

public class ps29 {
    public static void main(String[] args) {
        // practice Sheet 3 \

        // 1.Write prog to convert string to lowercase 
        String name = "JAdeja";
        name = name.toLowerCase();  
        System.out.println("Lowercse of string : "+ name);

        // 2.wap java code to replace spaces with underscores

        String name2 = "Vishwraj k Jadeja";
        name2 = name2.replace(" ", "_");
        System.out.println("String after replacing spaces with underscores: "+ name2);

        // 3.write java code to fill in a letter template which looks like this
        // letter = "Dear <|name|>, Thanks a lot!"
        // replace <|name|> with your name in the letter
        String letter = "Dear<|name|> ,Thanks a lot!";
        letter = letter.replace("<|name|>", "Vishwraj");

        // 4. wap to detect double and triple spaces in a string.
        String name3 = "Vishwraj  k   Jadeja";
        if(true){
            System.out.println("2 spaces"+name3.indexOf("  "));
        }
         System.out.println("3 spaces"+name3.indexOf("   "));
       
        // 5.write a code to format the following letter using escape sequence 
        // letter = "Dear vishu , this Java Course  is nice. Thanks"

        String message = "Dear vishu ,\n \t this Java Course  is nice.\n\t\t Thanks";
        System.out.println("The letter is: "+message);
    }
}
