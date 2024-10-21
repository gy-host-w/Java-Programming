public class Lab4Task2 {
    public static void main(String[] args) {
        int i = 5;
        int j = 7;
        int k = TestMax(i,j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }
    public static int TestMax(int i, int j) {
        int result;
        if (i > j) {
            result = i;
        }
        else result = j;
        return result;
    }
}
