public class week8task4 {
    public static void main(String[] args) {
        double[] mylist = new double[5];
        for (int i = 0; i < mylist.length; i++){
            mylist[i] = Math.random()*10;
        }
        for (int i = 0; i < mylist.length; i++){
            System.out.println(mylist[i] + " ");
        }
    }
}
