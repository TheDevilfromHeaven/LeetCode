import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/binary-prefix-divisible-by-5/solution/ke-bei-5-zheng-chu-de-er-jin-zhi-qian-zh-asih/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public List<Boolean> prefixesDivBy5(int[] A) {
        ArrayList<Boolean> result = new ArrayList<>();
        int prefix = 0;
        for (int i = 0; i < A.length; i++){
            prefix = ((prefix << 1) + A[i]) % 5;
            result.add(prefix == 0);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
        BinaryPrefixDivisibleBy5 binaryPrefixDivisibleBy5 = new BinaryPrefixDivisibleBy5();
        List<Boolean> booleans = binaryPrefixDivisibleBy5.prefixesDivBy5(A);
        for (Boolean b : booleans) {
            System.out.println(b);
        }
    }
}
