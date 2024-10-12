import java.util.Arrays;
import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city1, city2, city3;
        System.out.println("Enter the first city:");
        city1 = scanner.nextLine();
        System.out.println("Enter the second city:");
        city2 = scanner.nextLine();
        System.out.println("Enter the third city:");
        city3 = scanner.nextLine();
        String[] cities = {city1, city2, city3};
        Arrays.sort(cities);
        System.out.println("The three cities in alphabetical order are: " + String.join(", ", cities));
    }
}
