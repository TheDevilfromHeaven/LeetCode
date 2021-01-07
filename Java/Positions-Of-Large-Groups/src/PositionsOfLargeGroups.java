import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PositionsOfLargeGroups {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/positions-of-large-groups/solution/jiao-da-fen-zu-de-wei-zhi-by-leetcode-so-fi3n/
      来源：力扣（LeetCode）
    * 官方解法一。就差一点就做出来了，可惜了。
    * */
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        int n = s.length();
        int num = 1;
        for (int i = 0; i < n; i++) {
            if (i == n - 1 || s.charAt(i) != s.charAt(i + 1)) {
                if (num >= 3) {
                    ret.add(Arrays.asList(i - num + 1, i));
                }
                num = 1;
            } else {
                num++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        PositionsOfLargeGroups positionsOfLargeGroups = new PositionsOfLargeGroups();
        List<List<Integer>> s = positionsOfLargeGroups.largeGroupPositions("aaa");
        System.out.println(s);
    }
}
