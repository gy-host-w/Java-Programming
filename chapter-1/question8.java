import java.util.Scanner;

public class question8 {
    public static void main(String[] args) {
        final double PI = 3.14;
        //Scanner input = new Scanner(System.in);
        //System.out.print("Enter the radius of a circle: ");
        double radius = 5.5;
        double perimeter = 2 * PI * radius;
        double area = PI * radius * radius;
        System.out.println("The perimeter of radius " + radius + " is " + perimeter);
        System.out.println("The area of the circle of radius " + radius + " is " + area);
    }
}
