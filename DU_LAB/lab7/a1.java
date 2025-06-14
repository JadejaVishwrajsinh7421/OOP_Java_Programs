import java.util.Scanner;

class student{
    public int id_no;
    public int no_subjects;
    public String [] subject_code;
    public int[] subject_credits;
    public String []  grade_obtained;
    public double spi; 

public student(){
    this.id_no = 0;
    this.no_subjects = 0;

    //this.subject_code = subject_code;
    //this.subject_credits=subject_credits;
    //this.grade_obtained= grade_obtained;
}

public void getdetails(){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter id_no");
    this.id_no =sc.nextInt();
    
    System.out.println("enter no of subjects");
    this.no_subjects = sc.nextInt();

    sc.nextLine();
    this.subject_code = new String[no_subjects];
    this.subject_credits = new int[no_subjects];
    this.grade_obtained= new String[no_subjects];

    for(int i=0; i <= no_subjects; i++){
        System.out.println("enter Subject code");
        this.subject_code[i] =sc.nextLine();

        System.out.println("enter Subject credits");
        this.subject_credits[i] =sc.nextInt();

        System.out.println("enter grade obtained (A/B/C/D/F)");
        this.grade_obtained[i] =sc.nextLine();
    }
}

public  void calulatespi(){
    int totalCredits = 0;
    int totalPoints= 0;
    for (int i=0;i< no_subjects;i++){
        
    }
}
public void display(){
    System.out.println("id.no" + id_no);
    System.out.println("no of subjects" + no_subjects);
    System.out.println("subjects details");
    for(int i=0 ; i<= no_subjects; i++){
        System.out.println("the subject code "+ subject_code 
                                +"sub credits" +subject_credits
                                +"grade"+ grade_obtained);
    }
}
}
public class a1 {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of students");
        int n =sc.nextInt();

        student[] stu =new student[n];

        for(int i=0;i< n; i++){
            System.out.println("enter details for students" + (i+1));
                stu [i] = new student();
                stu [i].getdetails();
                stu [i].calulatespi();
        }
        System.out.println("students");
        for(int i=0 ;i< n; i++){
            stu[i].display();
        }
    }  
}