import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/pascals-triangle/solution/yang-hui-san-jiao-by-leetcode-solution-lew9/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++){
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j <= i; j++){
                if (j == 0 || j == i){
                    list.add(1);
                }else {
                    list.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        List<List<Integer>> generate = pascalsTriangle.generate(5);
        for (List x : generate) {
            System.out.println(x);
        }
    }
}
