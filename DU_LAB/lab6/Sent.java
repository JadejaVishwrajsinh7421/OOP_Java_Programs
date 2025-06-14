package lab6;
import java.util.Scanner;

class Sen{
        int[] array = new int [5];
        public void condition(String word) {
            for(int i=0;i<word.length();i++){
                if( word.charAt(i) == 'a'|| word.charAt(i) == 'A'){
                    array[0]++;
                }
                else if( word.charAt(i) == 'e'|| word.charAt(i) == 'E'){
                    array[1]++;
                }
                else if(( word.charAt(i) == 'i'|| word.charAt(i) == 'I')){
                    array[2]++;
                }
                else if(( word.charAt(i) == 'o'|| word.charAt(i) == 'O')){
                    array[3]++;
                }
                else if(( word.charAt(i) == 'u'|| word.charAt(i) == 'U')){
                    array[4]++;
                }
            }
        }
        public void print() {
            System.out.println("A in sentence"+array[0]);
            System.out.println("E in sentence"+array[1]);
            System.out.println("I in sentence"+array[2]);
            System.out.println("O in sentence"+array[3]);
            System.out.println("U in sentence"+array[4]);
        }
    }

public class Sent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Sen text = new  Sen();
        while (true) {
            System.out.println("enter a string");
            String word = sc.nextLine();
            if(word.equalsIgnoreCase("quit")){
                break;
            }
            text.condition(word);
        }
        text.print();
        sc.close();

    }
}