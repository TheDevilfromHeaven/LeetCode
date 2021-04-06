public class ReverseBits {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/reverse-bits/solution/dian-dao-er-jin-zhi-wei-by-leetcode-solu-yhxz/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; ++i) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }

    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        int i = reverseBits.reverseBits(00000010100101000);
        System.out.println(i);
    }
}
