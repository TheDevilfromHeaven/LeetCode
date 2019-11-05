import java.util.Arrays;

public class SortArrayByParity {
    /**
     * 官方的解法：方法3
     *public int[] sortArrayByParity(int[] A) {
     *         int i = 0, j = A.length - 1;
     *         while (i < j) {
     *             if (A[i] % 2 > A[j] % 2) {
     *                 int tmp = A[i];
     *                 A[i] = A[j];
     *                 A[j] = tmp;
     *             }
     *
     *             if (A[i] % 2 == 0) i++;
     *             if (A[j] % 2 == 1) j--;
     *         }
     *
     *         return A;
     *     }
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/sort-array-by-parity/solution/an-qi-ou-pai-xu-shu-zu-by-leetcode/
     * 来源：力扣（LeetCode）
     */

    /**
     *交换一下就可以解决。
     */
    public int[] sortArrayByParity(int[] A) {
        int x = 0;
        int swap;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                swap = A[i];
                A[i] = A[x];
                A[x] = swap;
                x++;
            }
        }
        return  A;
    }

    public static void main(String[] args) {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        int[] array= {2,3,4,6,7,8,9,10};
        int[] ints = sortArrayByParity.sortArrayByParity(array);
        String s = Arrays.toString(ints);
        System.out.println(s);
    }
}
