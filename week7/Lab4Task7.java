
public class Lab4Task7 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        System.out.println("Before invoking the swap method, num1 is " + num1
        + " and num2 is " + num2);
        swap(num1,num2);
        System.out.println("After invoking the swap method, num1 is " + num1
        + " and num2 is " + num2);
    }
    public static void swap(int a, int b) {
        System.out.println("\tInside the swap method");
        System.out.println("\t\tBefore swapping, num1 is " + a
        + " and num2 is " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\t\tAfter swapping, num1 is " + a
        + " and num2 is " + b);
    }
}
