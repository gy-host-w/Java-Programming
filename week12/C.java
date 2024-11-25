public class C {
    private boolean x;
    public static void main(String[] args) {
        C object1 = new C();
        System.out.println(object1.x);
        System.out.println(object1.convert());
    }

    private int convert() {
        return x ? 1 : -1;
    }
}
