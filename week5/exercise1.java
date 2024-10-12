import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal value (0 to 15):");

        while (true) {
            int decimalValue = scanner.nextInt();
            if (decimalValue >= 0 && decimalValue <= 15) {
                System.out.println("The hex value is " + Integer.toHexString(decimalValue).toUpperCase());
                break;
            } else {
                System.out.println("Invalid input. Please enter a decimal value between 0 and 15.");
            }
        }

        scanner.close();
    }
}
