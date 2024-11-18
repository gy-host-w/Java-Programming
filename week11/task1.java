public class task1 {
    public static void main(String[] args) {
        // 声明并初始化一个二维数组
        int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        int allLength = array.length;
        System.out.println("Length of matrix " + allLength);

        int Length1 = array[0].length;
        System.out.println("Length of first row " + Length1);

        int Length2 = array[1].length;
        System.out.println("Length of second row " + Length2);

        int Length3 = array[2].length;
        System.out.println("Length of third row " + Length3);

        int Length4 = array[3].length;
        System.out.println("Length of forth row " + Length4);


    }
}