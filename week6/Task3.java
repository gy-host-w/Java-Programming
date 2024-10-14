import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*101);
        Scanner in = new Scanner(System.in);
        System.out.println("Guess a magic number between 1 and 100");

        int guess = -1;
        while (guess != number) {
            System.out.println("Enter your guess: ");
            guess = in.nextInt();

            if (guess == number) {
                System.out.println("Yes,the number is " + number);
            }
            else if (guess > number) {
                System.out.println("your guess is too high");
            }
            else{
                System.out.println("your guess is too low");
            }
        }
    }
}
