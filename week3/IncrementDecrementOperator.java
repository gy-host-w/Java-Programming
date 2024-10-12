public class IncrementDecrementOperator {
    public static void main(String[] args) {
        int a = 6;
        int b = a++;
        int c = ++a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        int x = 6;
        int y = x--;
        int z = --x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
    }
}
