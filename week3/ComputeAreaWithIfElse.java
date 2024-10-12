import java.util.Scanner;

public class ComputeAreaWithIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        if (radius >=0 ){
            double area = Math.PI * radius * radius;
            System.out.println("The area of the circle is " + area);
            input.close();
        }
        else{
            System.out.println("The area of the circle does not exist");
        }
    }
}
