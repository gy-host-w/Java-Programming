public class week8task9 {
    public static void main(String[] args) {
        int[] mylist = new int[5];
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = (int)(Math.random() * mylist.length);
        }
        System.out.println("Array before shifting");
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
        }
        int temp = mylist[0];
        for (int i = 1; i < mylist.length; i++) {
            mylist[i - 1] = mylist[i];
        }
        mylist[mylist.length - 1] = temp;
        System.out.println("\nArray after shifting");
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
        }
    }
}
