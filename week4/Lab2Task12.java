import java.util.Scanner;

public class Lab2Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = scanner.nextInt();
        scanner.close();

        if (number % 5 == 0) {
            System.out.println("HiFive");
        }
        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
    }
}

