import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        final int NUMBER_OF_LINES = 5;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = "";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_LINES) {
            int number1 = (int)(Math.random() * 10);
            int number2 = (int)(Math.random() * 10);

            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.print("What is " + number1 + "-" + number2 + "? ");
            int answer = input.nextInt();
            if (answer == number1 - number2) {
                System.out.println("Correct!\n");
                correctCount++;
            }
            else{
                System.out.println("Wrong!\n" + number1 +
                        " - " + number2 + "should be " + (number1 - number2) + "\n");
            }
            count++;
            output += "\n" + number1 + "-" + number2 + "=" + answer +
                    ((number1 - number2 == answer) ? "correct" : "wrong");
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount +
                "\nTest time is " + elapsedTime / 1000 + " seconds\n" + output);
    }
}
