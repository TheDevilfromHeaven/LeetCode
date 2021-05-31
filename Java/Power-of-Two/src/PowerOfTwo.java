public class PowerOfTwo {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/power-of-two/solution/2de-mi-by-leetcode-solution-rny3/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        PowerOfTwo powerOfTwo = new PowerOfTwo();
        boolean powerOfTwo1 = powerOfTwo.isPowerOfTwo(16);
        System.out.println(powerOfTwo1);
    }
}
