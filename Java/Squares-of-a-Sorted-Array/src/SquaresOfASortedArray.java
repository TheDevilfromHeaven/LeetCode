import java.util.Arrays;

public class SquaresOfASortedArray {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array/solution/you-xu-shu-zu-de-ping-fang-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方解法三，双指针速度太快了。
    * */
//    public int[] sortedSquares(int[] A) {
//        int[] ans = new int[A.length];
//        for (int i = 0,j = A.length - 1,pos = A.length - 1;i <= j;pos--){
//            if (A[i] * A[i] < A[j] * A[j]){
//                ans[pos] = A[j] * A[j];
//                j--;
//            }else {
//                ans[pos] = A[i] * A[i];
//                i++;
//            }
//        }
//        return ans;
//    }

    public int[] sortedSquares(int[] A) {
        int[] ans = new int[A.length];
        for (int i = 0;i<A.length;i++){
            ans[i] = A[i] * A[i];
        }
        Arrays.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {-4,-1,0,3,10};
        SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();
        int[] ints = squaresOfASortedArray.sortedSquares(A);
        for (int x:ints) {
            System.out.println(x);
        }
    }
}
