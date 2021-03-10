import java.util.Arrays;

public class ReshapeTheMatrix {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/reshape-the-matrix/solution/zhong-su-ju-zhen-by-leetcode-solution-gt0g/
      来源：力扣（LeetCode）
    * 官方解法一。没想到除法。
    * */
//    public int[][] matrixReshape(int[][] nums, int r, int c) {
//        int m = nums.length;
//        int n = nums[0].length;
//        if (m * n != r * c) {
//            return nums;
//        }
//
//        int[][] ans = new int[r][c];
//        for (int x = 0; x < m * n; ++x) {
//            ans[x / c][x % c] = nums[x / n][x % n];
//        }
//        return ans;
//    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length * nums[0].length != r * c) return nums;
        int[] ints = new int[nums.length * nums[0].length];
        int index = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums[0].length; j++){
                ints[index] = nums[i][j];
                index++;
            }
        }
        index = 0;
        int[][] result = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                result[i][j] = ints[index];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,2},{3,4}};
        int r = 2;
        int c = 4;
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] ints = reshapeTheMatrix.matrixReshape(nums, r, c);
        for (int[] n : ints) {
            for (int i = 0; i < n.length; i++){
                System.out.print(n[i]);
            }
            System.out.println();
        }
    }
}
