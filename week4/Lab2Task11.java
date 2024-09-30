import java.util.Scanner;

public class Lab2Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        double tax = purchaseAmount * 0.06;
        System.out.printf("Sales tax is $%.2f" , tax);
    }
}
