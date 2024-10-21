import java.util.Scanner;

public class Lab4Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first integer:");
        int num1 = scanner.nextInt();

        System.out.println("Enter second integer:");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);

        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);

        scanner.close();
    }

    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }
}
