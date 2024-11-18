import java.util.Random;

public class task13 {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }

        System.out.println("Generated matrix:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int largestRowIndex = -1;
        int largestColumnIndex = -1;
        int maxOnes = 0;

        for (int i = 0; i < 4; i++) {
            int rowOnes = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    rowOnes++;
                }
            }
            if (rowOnes > maxOnes) {
                largestRowIndex = i;
                maxOnes = rowOnes;
                largestColumnIndex = -1;
            }

            if (largestRowIndex == i) {
                for (int j = 0; j < 4; j++) {
                    int columnOnes = 0;
                    for (int k = 0; k < 4; k++) {
                        if (matrix[k][j] == 1) {
                            columnOnes++;
                        }
                    }
                    if (columnOnes > maxOnes || (columnOnes == maxOnes && largestColumnIndex == -1)) {
                        largestColumnIndex = j;
                    }
                }
            }
        }

        System.out.println("The largest row index: " + largestRowIndex);
        if (largestColumnIndex != -1) {
            System.out.println("The largest column index: " + largestColumnIndex);
        } else {
            System.out.println("No column has more 1s than the largest row.");
        }
    }
}