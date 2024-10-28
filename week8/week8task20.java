public class week8task20 {
    public static void main(String[] args) {
        int[] list = {1, 4, 8, 5, 9, 7};
        int i = linearsearch(list, 8);
        System.out.println("The key is found at index " + i);
    }
    public static int linearsearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) {
                return i;
            }
        }
        return -1;
    }
}
