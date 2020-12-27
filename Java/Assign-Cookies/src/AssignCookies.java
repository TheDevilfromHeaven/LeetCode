import java.util.Arrays;

public class AssignCookies {
    /*
    *作者：LeetCode-Solution
     链接：https://leetcode-cn.com/problems/assign-cookies/solution/fen-fa-bing-gan-by-leetcode-solution-50se/
     来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        for (int i = 0, j = 0; i < g.length && j < s.length; i++, j++){
            while (j < s.length && g[i] > s[j]){
                j++;
            }
            if (j < s.length){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        AssignCookies assignCookies = new AssignCookies();
        int contentChildren = assignCookies.findContentChildren(g, s);
        System.out.println(contentChildren);
    }
}
