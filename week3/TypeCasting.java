public class TypeCasting {
    public static void main(String[] args) {
        double d = 3;
        System.out.println("d is:" + d);
        int i = (int) 3.0;
        System.out.println("i is:" + i);

        System.out.println("the value of 1/2 in double is:" + (double) 1/2);
        System.out.println("the value of 1/2 in int is:" + (int) 1/2);

        double x = 4.5;
        int y = (int) x;
        System.out.println("x is:" + x);
        System.out.println("y is:" + y);
    }
}
