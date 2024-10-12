import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = scanner.nextDouble();

        double s = 2 * Math.sin(Math.PI / 5) * r;

        double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));

        area = Math.round(area * 100.0) / 100.0;

        System.out.println(area);

        scanner.close();
    }
}
