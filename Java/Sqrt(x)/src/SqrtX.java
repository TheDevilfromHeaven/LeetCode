public class SqrtX {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/sqrtx/solution/x-de-ping-fang-gen-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方解法二。
    * */
    public int mySqrt(int x) {
        int left = 0,right = x;
        int result = 0;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x){
                result = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int i = new SqrtX().mySqrt(4);
        System.out.println(i);
    }
}
