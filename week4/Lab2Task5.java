import java.util.Scanner;

public class Lab2Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        double grade = subtotal * gratuity / 100;
        double total = subtotal + grade;
        System.out.println("The gratuity is $ " + grade + " and the total is $" + total);
    }
}
