public class NumberOf1Bits {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/number-of-1-bits/solution/wei-1de-ge-shu-by-leetcode-solution-jnwf/
      来源：力扣（LeetCode）
    * 官方解法二
    * */
//    public int hammingWeight(int n) {
//        int ret = 0;
//        while (n != 0) {
//            n &= n - 1;
//            ret++;
//        }
//        return ret;
//    }

    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }

    public static void main(String[] args) {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        int i = numberOf1Bits.hammingWeight(00000000000000000000000000001011);
        System.out.println(i);
    }
}
