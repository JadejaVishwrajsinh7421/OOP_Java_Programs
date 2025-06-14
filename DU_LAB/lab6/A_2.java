package lab6;

import java.util.Scanner;


class Time{
    
    Time(int hour,int minute,int second){   
        this.hour=hour;
        this.minute=minute;
        this.second=second; 
    }
    int add(){
        if(second>60){
            minute++;
        }
        else if(minute>60){
            hour++;
        }
        
    }
}

public class A_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        //time1
        Time t1=new Time(1,20,45);
        Time t2=new time(hour:2,minute:29,second:30);
        
        

        //time2
    }
    
}
