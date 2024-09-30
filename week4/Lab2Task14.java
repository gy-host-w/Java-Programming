import java.util.Scanner;

public class Lab2Task14 {
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

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Normal");
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("Overweight");
        }
    }
}
