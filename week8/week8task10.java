import java.util.Scanner;

public class week8task10 {
    public static void main(String[] args) {
        String[] months = {"January","February","March","April","May","June","July",
        "August","September","October","November","December"};
        System.out.print("Enter the month (1 to 12): ");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        System.out.println("The month is " + months[month - 1]);
        input.close();
    }
}
