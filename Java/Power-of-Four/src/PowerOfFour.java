public class PowerOfFour {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/power-of-four/solution/4de-mi-by-leetcode-solution-b3ya/
      来源：力扣（LeetCode）
    * 官方解法二。
    * */
    public boolean isPowerOfFour(int n) {
        return n > 0 && (n & (n - 1)) == 0 && n % 3 == 1;
    }

    public static void main(String[] args) {
        PowerOfFour powerOfFour = new PowerOfFour();
        boolean powerOfFour1 = powerOfFour.isPowerOfFour(16);
        System.out.println(powerOfFour1);
    }
}
