public class Task7 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        sum = 0;
        int j = 0;
        while (j < 10)
        {
            sum += j;
            j++;
        }
        System.out.println(sum);
        sum = 0;
        j = 0;
        do{
            sum += j;
            j++;
        }while (j < 10);
        System.out.println(sum);
    }
}
