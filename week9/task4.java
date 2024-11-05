package demo1.week9;
import java.util.Date;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("The elapsed time since Jan 1 , 1970 is "+date.getTime()+" milliseconds");
        System.out.println(date.toString());
    }
}
