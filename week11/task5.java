public class task5 {
    public static void main(String[] args) {
        // 创建一个2D数组
        int[][] matrix = new int[3][3];

        // 在2D数组中插入随机值（0-19）
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                matrix[row][column] = (int) (Math.random() * 20);
            }
        }

        // 计算二维数组中所有元素的总和
        int total = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                total += matrix[row][column];
            }
        }

        // 打印总和
        System.out.println("The sum is = " + total);
    }
}