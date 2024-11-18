import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        int[][] m = getArray();
        System.out.println("\nThe sum of all elements is " + sum(m));
    }
    public static int[][] getArray() {
        Scanner sc = new Scanner(System.in);
        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " + m[0].length + " columns: ");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        return m;
    }
    public static int sum(int[][] m) {
        int sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum += m[i][j];
            }
        }
        return sum;
    }
}
