public class Task12 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }

        // 修改打印方式，按照要求每行打印10个素数
        for (int i = 0; i < 50; i += 10) {
            for (int j = i; j < i + 10 && j < 50; j++) {
                System.out.print(primeNumbers[j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

