public class task7 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                int i1 = (int)(Math.random()*matrix[row].length);
                int j1 = (int)(Math.random()*matrix[row].length);
                int temp = matrix[row][col];
                matrix[row][col] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
        for(int row = 0; row < matrix.length; row++) {
            for(int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
