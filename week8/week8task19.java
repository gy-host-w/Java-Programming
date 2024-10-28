public class week8task19 {
    public static void main(String[] args) {
        printMax(1,3,5,7);
        printMax(new double[] {1 , 3, 5, 7});
    }
    public static void printMax(double... numbers) {
        if(numbers.length == 0) {
            System.out.println("No argument is passed");
            return;
        }
        double max = numbers[0];
        for(int i = 0; i < numbers.length; i++) {
            if(max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("The max value is " + max);
    }
}
