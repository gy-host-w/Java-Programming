import java.util.Scanner;

public class Lab2Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        int monthlySaving = input.nextInt();
        double accountValue = 0;
        double rate = 0.00417;
        for (int i = 1; i <= 6; i++) {
            accountValue = monthlySaving * (1 + rate) + accountValue * (1 + rate);
        }
        System.out.println("After the sixth month,the account value is $" + accountValue);
    }
}
