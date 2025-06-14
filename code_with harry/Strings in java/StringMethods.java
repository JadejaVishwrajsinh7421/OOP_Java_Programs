import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        String a = "hello";
        // String b =  new String ("world");
        // as String are immutable therfore we cannot change the value of a string but
        //  to do so we can use new varriable is added the value of change Stirng given in new variable 

        int l=a.length(); //returns length of string
        System.out.println("Length of string a is: " + l);

        String b = ":VKJ";
        String L =b.toLowerCase();// returns toLowerCase
        System.out.println("Lower case of string b is: " + L);

        String U = "jadeja";
        String v =b.toUpperCase();// returns toUpperCase
        System.out.println("Upper case of string b is: " + v);

        String nonTrimmed ="    helll0oo  vkj     ";
        nonTrimmed = nonTrimmed.trim(); // returns the string after removing first and last spaces
        System.out.println("Trimmed string is: " + nonTrimmed);   

        String c = a.substring(3,4);
        // returns  from start index to end index  .
        System.out.println("SubString: "+c);

        System.out.println("String replace: "+a.replace('e','l'));
        // returns the string after replacing the first character with second character

        System.out.println("String replace by using string: "+b.replace("VKJ","Vishvaraj"));
        // returns the string after replacing the first string with second string   

        System.out.println("String starts with: "+b.startsWith("Vi"));
        // returns true if the string starts with the given string

        System.out.println("String  end with "+ b.endsWith("J"));
        // returns true if the string ends with the given string    

        System.out.println("String Character give the index " +b.charAt(2));
        // returns the character at the given index

        System.out.println("String index of character give starting index of given character: " +U.indexOf('V'));
        // returns the index of the first occurrence of the given character

        // for String we can start with any index if we have 2 similar string or character
        String modifiedName = "Harryrryarry23";
        System.out.println("String index of String give starting index of given string: "+modifiedName.indexOf("rry",4));
        // if match not found then it give -1 as output

        System.out.println("String last index of: "+modifiedName.lastIndexOf("rry"));
        // returns the index of the last occurrence of the given character

        System.out.println("String of equality"+ U.equals("JADEJA") );
        // returns true if the string is equal to the given string
        System.out.println("String of equality ignore case: "+ U.equalsIgnoreCase("JADEJA") );
        // returns true if the string is equal to the given string ignoring case

        System.out.println("compare two String"+ U.compareTo("jadeja"));
        // returns the difference between the two strings in terms of ASCII value
        System.out.println("compare two String ignore case"+ U.compareToIgnoreCase("JADEJA"));
        // returns the difference between the two strings in terms of ASCII value ignoring case

        // Cocncation
        String Word1 ="Re";
        String Word2 ="Work";
        String Word3 = "ing";
        int num = 23;

        String Word4 = Word1.concat(Word2);
        System.out.println("Concatenation of two string: "+Word4);

        Word4 = Word4.concat(Word3);
        System.out.println("Concatenation of two string: "+Word4);
        
        Word4 = Word4 + num;  
        System.out.println("Concatenation of two string: "+Word4);
        // returns the string after concatenating the given string  
          



    }
}
