public class MatrixDiagonalSum {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/matrix-diagonal-sum/solution/ju-zhen-dui-jiao-xian-yuan-su-de-he-by-leetcode-so/
      来源：力扣（LeetCode）
    *官方解法二
    * */
//    public int diagonalSum(int[][] mat) {
//        int n = mat.length, sum = 0, mid = n / 2;
//        for (int i = 0; i < n; ++i) {
//            sum += mat[i][i] + mat[i][n - 1 - i];
//        }
//        return sum - mat[mid][mid] * (n & 1);
//    }

    public int diagonalSum(int[][] mat) {
        int result = 0;
        int end = mat.length - 1;
        for (int i = 0; i < mat.length; i++){
            if (i == end - i){
                result += mat[i][i];
            }else {
                result += mat[i][i] + mat[i][end - i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        MatrixDiagonalSum matrixDiagonalSum = new MatrixDiagonalSum();
        int i = matrixDiagonalSum.diagonalSum(mat);
        System.out.println(i);
    }
}
