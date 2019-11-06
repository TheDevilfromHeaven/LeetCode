import java.lang.reflect.Array;
import java.util.Arrays;

public class NRepeatedElementInSize2NArray {
    /**
     * 官方的解法1：2n个元素，n+1个不同的元素，重复那个一定是答案。
     * public int repeatedNTimes(int[] A) {
     *         Map<Integer, Integer> count = new HashMap();
     *         for (int x: A) {
     *             count.put(x, count.getOrDefault(x, 0) + 1);
     *         }
     *
     *         for (int k: count.keySet())
     *             if (count.get(k) > 1)
     *                 return k;
     *
     *         throw null;
     *     }
     *
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/n-repeated-element-in-size-2n-array/solution/zhong-fu-n-ci-de-yuan-su-by-leetcode/
     * 来源：力扣（LeetCode）
     */

    /**
     * 没考虑那么仔细，没看到其中的规律。
     */
    public int repeatedNTimes(int[] A) {
        Arrays.sort(A);
        int count = 1;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] == A[i]) {
                    count++;
                    if (A.length / 2 == count) {
                        return A[i];
                    } else {
                        break;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        NRepeatedElementInSize2NArray nRepeatedElementInSize2NArray = new NRepeatedElementInSize2NArray();
        int[] A = {9,5,3,3};
        int i = nRepeatedElementInSize2NArray.repeatedNTimes(A);
        System.out.println(i);
    }
}
