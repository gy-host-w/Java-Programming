import java.util.Scanner;

public class week8task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }
        scanner.close();

        double min = min(numbers);
        System.out.println("The minimum number is: " + min);
    }

    public static double min(double[] array) {
        double min = array[0];
        for (double num : array) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
