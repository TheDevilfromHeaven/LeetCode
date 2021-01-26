public class NumberOfEquivalentDominoPairs {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/number-of-equivalent-domino-pairs/solution/deng-jie-duo-mi-nuo-gu-pai-dui-de-shu-li-yjlz/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] ints = new int[100];
        int result = 0;
        for (int[] dominoe : dominoes) {
            int val = dominoe[0] < dominoe[1] ? dominoe[0] * 10 + dominoe[1] : dominoe[1] * 10 + dominoe[0];
            result += ints[val];
            ints[val]++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] dominoes = {{1,2},{2,1},{3,4},{5,6}};
        NumberOfEquivalentDominoPairs numberOfEquivalentDominoPairs = new NumberOfEquivalentDominoPairs();
        int i = numberOfEquivalentDominoPairs.numEquivDominoPairs(dominoes);
        System.out.println(i);
    }
}
