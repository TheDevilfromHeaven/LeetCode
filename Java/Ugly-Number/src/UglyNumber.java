public class UglyNumber {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/ugly-number/solution/chou-shu-by-leetcode-solution-fazd/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] ints = {2,3,5};
        for (int m : ints) {
            while (n % m == 0){
                n /= m;
            }
        }
        return n == 1;
    }

    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        boolean ugly = uglyNumber.isUgly(6);
        System.out.println(ugly);
    }
}
