import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
        double x = ( e * d - b * f ) / ( a * d - b * c );
        double y = ( a * f - e * c ) / ( a * d - b * c );
        System.out.println("the answer of the 2*2 linear equation : x = " + x + " y = " + y);
    }
}
