import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a letter: ");
        String input = scanner.nextLine();
        if (input.matches("[a-zA-Z]")) {
            if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("i")
                    || input.equalsIgnoreCase("o") || input.equalsIgnoreCase("u")) {
                System.out.println(input + " is a vowel");
            } else {
                System.out.println(input + " is a consonant");
            }
        } else {
            System.out.println(input + " is an invalid input");
        }

        scanner.close();
    }
}
