import java.util.Scanner;

public class Lab2Task13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your pay: ");
        double pay = input.nextDouble();
        System.out.print("Your pay without increment is: " + pay);

        System.out.print("Enter your score: ");
        double score = input.nextDouble();
        if(score > 90){
            double new_pay = pay + (pay * 0.03);
            System.out.println("Your new pay is: " + new_pay);
        }
        else {
            double new_pay = pay + (pay * 0.01);
            System.out.println("Your new pay is: " + new_pay);
        }
    }
}
