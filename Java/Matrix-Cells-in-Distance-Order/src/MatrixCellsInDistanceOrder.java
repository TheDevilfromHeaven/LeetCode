import java.util.Arrays;
import java.util.Comparator;

public class MatrixCellsInDistanceOrder {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/matrix-cells-in-distance-order/solution/ju-chi-shun-xu-pai-lie-ju-zhen-dan-yuan-ge-by-leet/
      来源：力扣（LeetCode）
    *官方解法一。
    * */
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ret = new int[R * C][];
        for (int i = 0;i<R;i++){
            for (int j = 0;j<C;j++){
                ret[i * C + j] = new int[]{i,j};
            }
        }
        Arrays.sort(ret, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (Math.abs(o1[0] - r0) + Math.abs(o1[1] -c0)) - (Math.abs(o2[0] - r0) + Math.abs(o2[1] -c0));
            }
        });
        return ret;
    }

    public static void main(String[] args) {
        MatrixCellsInDistanceOrder matrixCellsInDistanceOrder = new MatrixCellsInDistanceOrder();
        int[][] ints = matrixCellsInDistanceOrder.allCellsDistOrder(2, 2, 0, 1);
        for (int i = 0;i<2 * 2;i++){
            System.out.println(Arrays.toString(ints[i]));
        }
    }
}
