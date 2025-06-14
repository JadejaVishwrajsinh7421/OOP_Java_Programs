import java.util.Scanner;

class Book{
    private String authorname;
    Book(String authorname){
        this.authorname=authorname;
    }
    public void display(){
        System.out.println("author name"+this.authorname);
    }
}
class BookPublication extends Book{
    private String title;
    BookPublication(String authorname,String title){
        super(authorname);
        this.title=title;
    }
    public void display(){
        super.display();
        //System.out.println("author name" + this.authourname);
        System.out.println("title name in bookpublication");
    }
}
class PaperPublication extends Book{
    private String title;
    PaperPublication(String authorname,String title){
        super(authorname);
        this.title=title;
    }
    public void display(){
        super.display();
        System.out.println("author name"+this.title);
    }
}

public class a2 {
    public static void main(String[]args){
        String a =args[0];
        String b =args[1];
        String c =args[2];
        
        Book b1; //obj 0f book is created 

        if(b.equalsIgnoreCase("book")){
            b1= new BookPublication(a,c);
        }
        else if (b.equals("paper")){
            b1 =new PaperPublication(a,c);
        }
        
        else {
            System.out.println("invalid");
            return;
        }
        b1.display();
    }
}
