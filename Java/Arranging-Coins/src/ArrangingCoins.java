public class ArrangingCoins {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/arranging-coins/solution/pai-lie-ying-bi-by-leetcode-solution-w52c/
      来源：力扣（LeetCode）
    * 官方解法一
    * */
//    public int arrangeCoins(int n) {
//        int left = 1, right = n;
//        while (left < right){
//            int mid = left + (right - left + 1) / 2;
//            if ((long) mid * (mid + 1) <= (long) 2 * n){
//                left = mid;
//            }else {
//                right = mid - 1;
//            }
//        }
//        return left;
//    }

//    public int arrangeCoins(int n) {
//        int res = 0;
//        while (n - res > 0)
//            n -= ++res;
//        return res;
//    }

    public int arrangeCoins(int n) {
        long count = 0;
        int line = 0;
        while (count <= n){
            count += ++line;
        }
        return count == n ? line : line - 1;
    }

    public static void main(String[] args) {
        int i = new ArrangingCoins().arrangeCoins(2147483647);
        System.out.println(i);
    }
}
