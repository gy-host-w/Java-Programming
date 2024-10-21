public class Lab4Task5 {
    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        nPrintln("Welcome to Java", 5);
        //nPrintln(15,"Computer Science");
    }
}
