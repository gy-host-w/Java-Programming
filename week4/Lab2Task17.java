import java.util.Random;
import java.util.Scanner;

public class Lab2Task17{
    public static void main(String[] args) {
        Random rand = new Random();
        int number1 = rand.nextInt(10); // 生成0到9之间的随机整数
        int number2 = rand.nextInt(10); // 生成0到9之间的随机整数

        // 将两个数字组合成两位数（考虑小于10的情况）
        String lotteryNumber = String.format("%02d", (number1 * 10 + number2));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        String userPick = scanner.nextLine();
        System.out.println("The lottery number is: " + lotteryNumber);
        // 比较用户输入和生成的彩票号码
        if (userPick.equals(lotteryNumber)) {
            System.out.println("Exact match: you win $10,000");
        } else if (userPick.charAt(0) == lotteryNumber.charAt(0) ||
                userPick.charAt(0) == lotteryNumber.charAt(1) ||
                userPick.charAt(1) == lotteryNumber.charAt(0) ||
                userPick.charAt(1) == lotteryNumber.charAt(1)) {
            if (userPick.charAt(0) == lotteryNumber.charAt(1) &&
                    userPick.charAt(1) == lotteryNumber.charAt(0)) {
                System.out.println("Match all digits: you win $3,000");
            } else {
                System.out.println("Match one digit: you win $1,000");
            }
        } else {
            System.out.println("Sorry: no match");
        }

        scanner.close();
    }
}