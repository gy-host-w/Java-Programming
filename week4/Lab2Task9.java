import java.util.Scanner;

public class Lab2Task9 {
    public static void main(String[] args) {
        double initialAmount = 100.0;
        double annualInterestRate = 0.05;
        double monthlyInterestRate = annualInterestRate / 12;
        int months = 3;

        double accountValue = 0.0;
        for (int i = 1; i <= months; i++) {
            accountValue += initialAmount;
            accountValue = accountValue * (1 + monthlyInterestRate);
        }

        System.out.println("After " + months + " months, the account value becomes: " + accountValue);
    }
}
