public class PowerOfThree {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/power-of-three/solution/3de-mi-by-leetcode-solution-hnap/
      来源：力扣（LeetCode）
    * 官方解法二。
    * */
//    public boolean isPowerOfThree(int n) {
//        return n > 0 && 1162261467 % n == 0;
//    }

    public boolean isPowerOfThree(int n) {
        while(n != 0 && n % 3 == 0){
            n /= 3;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        boolean powerOfThree = new PowerOfThree().isPowerOfThree(27);
        System.out.println(powerOfThree);
    }
}
