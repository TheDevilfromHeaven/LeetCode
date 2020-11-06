import java.util.Arrays;

public class SortIntegersByTheNumberOf1Bits {
    /*
    * 作者：yourtion
      链接：https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits/solution/javaliang-ci-xun-huan-da-bai-100-by-yourtion/
      来源：力扣（LeetCode）
    * 不知道怎么把数字转换二进制。别人的解法。
    * */
    public int[] sortByBits(int[] arr) {
        int[] map = new int[arr.length];
        for (int i = 0;i<arr.length;i++){
            map[i] = Integer.bitCount(arr[i]) * 10000000 + arr[i];
        }
        Arrays.sort(map);
        for (int j = 0;j<map.length;j++){
            map[j] = map[j] % 10000000;
        }
        return map;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        SortIntegersByTheNumberOf1Bits sortIntegersByTheNumberOf1Bits = new SortIntegersByTheNumberOf1Bits();
        int[] ints = sortIntegersByTheNumberOf1Bits.sortByBits(arr);
        for (int x: ints){
            System.out.println(x);
        }
    }
}
