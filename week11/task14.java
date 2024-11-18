public class task14 {
    public static void shuffle(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = (int) (Math.random() * n);
            // 正确的行打乱应该是交换整行，而不是单个元素
            // 以下是修正后的代码，使用一个临时数组来存储并交换整行
            int[] tempRow = matrix[i];
            matrix[i] = matrix[randomIndex];
            matrix[randomIndex] = tempRow;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};
        shuffle(matrix);
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}