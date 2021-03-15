public class ToeplitzMatrix {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/toeplitz-matrix/solution/tuo-pu-li-ci-ju-zhen-by-leetcode-solutio-57bb/
      来源：力扣（LeetCode）
    * 官方解法一。想复杂了，越想越乱。
    * */
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] != matrix[i - 1][j - 1]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix = {{11,74,7,93},{40,11,74,7}};
        ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();
        boolean toeplitzMatrix1 = toeplitzMatrix.isToeplitzMatrix(matrix);
        System.out.println(toeplitzMatrix1);
    }
}
