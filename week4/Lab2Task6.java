import java.util.Scanner;

public class Lab2Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();
        double kilograms = weight * 0.45359237;
        double meters = height * 0.0254;
        double bmi = kilograms / (meters * meters);
        System.out.println("BMI is " + bmi);
    }
}
