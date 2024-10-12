import java.util.Scanner;

public class PayIncrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your pay: ");
        double pay = input.nextDouble();
        System.out.print("Your pay without increment is: " + pay);

        System.out.print("Enter your score: ");
        double score = input.nextDouble();
        if (score > 90){
            double new_pay = pay + (pay * 0.03);
            System.out.println("Your pay with increment is: " + new_pay);
        }
    }
}
