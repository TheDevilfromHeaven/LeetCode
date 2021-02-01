import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FairCandySwap {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/fair-candy-swap/solution/gong-ping-de-tang-guo-jiao-huan-by-leetc-tlam/
      来源：力扣（LeetCode）
    * 官方解法一
    * */
    public int[] fairCandySwap(int[] A, int[] B) {
        int sumA = Arrays.stream(A).sum();
        int sumB = Arrays.stream(B).sum();
        int delta = (sumA - sumB) / 2;
        Set<Integer> rec = new HashSet<Integer>();
        for (int num : A) {
            rec.add(num);
        }
        int[] ans = new int[2];
        for (int y : B) {
            int x = y + delta;
            if (rec.contains(x)) {
                ans[0] = x;
                ans[1] = y;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] A = {1,1};
        int[] B = {2,2};
        FairCandySwap fairCandySwap = new FairCandySwap();
        int[] ints = fairCandySwap.fairCandySwap(A, B);
        for (int n : ints) {
            System.out.println(n);
        }
    }
}
