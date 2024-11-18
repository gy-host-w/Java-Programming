import java.util.Scanner;

public class task12 {
    // 方法：计算指定列的元素之和
    public static double sumColumn(double[][] matrix, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][columnIndex];
        }
        return sum;
    }

    public static void main(String[] args) {
        // 示例：3x4矩阵
        double[][] matrix = new double[3][4];
        System.out.println("Enter a 3-by-4 matrix row by row:");
        Scanner input = new Scanner(System.in);
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = input.nextDouble();
            }
        }

        // 遍历每一列，计算并打印每列的和
        for (int i = 0; i < matrix[0].length; i++) {
            double sum = sumColumn(matrix, i);
            System.out.println("Sum of the elements at column " + (i + 1) + " is " + sum);
        }
    }
}