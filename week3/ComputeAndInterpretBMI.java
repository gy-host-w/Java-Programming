import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the height in inches: ");
        double height = input.nextDouble();
        System.out.print("Enter the weight in pounds: ");
        double weight = input.nextDouble();
        final double KILLOGRAMS_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;

        double weighInkillograms = weight*KILLOGRAMS_PER_POUND;
        double heightMeter = height*METER_PER_INCH;
        double bmi = weighInkillograms / (heightMeter * heightMeter);
        System.out.println("BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight");
        }
        else if (bmi < 25){
            System.out.println("You are normal");
        }
        else if (bmi < 30) {
            System.out.println("You are overweight");
        }
        else {
            System.out.println("You are obese");
        }

    }
}
