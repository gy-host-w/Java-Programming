public class week8task16 {
    public static void main(String[] args) {
        int x = 1;
        int[] y = new int[10];
        System.out.println("Value of x before is " + x);
        System.out.println("Value of y[0] before is " + y[0]);
        test(x,y);
        System.out.println("Value of x after is " + x);
        System.out.println("Value of y[0] after is " + y[0]);
    }
    public static void test(int x, int[] y) {
        x = 2;
        y[0] = 5;
    }
}
