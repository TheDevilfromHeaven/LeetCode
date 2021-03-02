import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/pascals-triangle-ii/solution/yang-hui-san-jiao-ii-by-leetcode-solutio-shuk/
      来源：力扣（LeetCode）
    * 官方解法二。
    * */
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        for (int i = 1; i <= rowIndex; ++i) {
            row.add((int) ((long) row.get(i - 1) * (rowIndex - i + 1) / i));
        }
        return row;
    }

    public static void main(String[] args) {
        PascalsTriangleII pascalsTriangleII = new PascalsTriangleII();
        List<Integer> row = pascalsTriangleII.getRow(3);
        System.out.println(row);
    }
}
