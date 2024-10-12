import java.util.Scanner;

public class ComputerAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double area = PI * radius * radius;

        System.out.println("The area for the circle of radius" + radius + " is " + area);
    }
}