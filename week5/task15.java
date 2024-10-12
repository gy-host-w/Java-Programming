import java.util.Scanner;
public class task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] cities = input.split("\\s+");

        if (cities.length != 2) {
            System.out.println("wrong");
            return;
        }

        String city1 = cities[0].trim();
        String city2 = cities[1].trim();

        if (city1.compareTo(city2) < 0) {
            System.out.println(city1 + " " + city2);
        } else {
            System.out.println(city2 + " " + city1);
        }
        scanner.close();
    }
}
