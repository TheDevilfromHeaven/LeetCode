public class NimGame {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/nim-game/solution/nim-you-xi-by-leetcode-solution-95g8/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public boolean canWinNim(int n) {
        return n % 4 != 0;
    }

    public static void main(String[] args) {
        boolean b = new NimGame().canWinNim(4);
        System.out.println(b);
    }
}
