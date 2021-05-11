public class DecodeXORedArray {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/decode-xored-array/solution/jie-ma-yi-huo-hou-de-shu-zu-by-leetcode-yp0mg/
      来源：力扣（LeetCode）
    * 官方解法一。
    *  异或运算具有如下性质：
        异或运算满足交换律和结合律；
        任意整数和自身做异或运算的结果都等于 0
        任意整数和 0 做异或运算的结果都等于其自身
    * */
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length + 1];
        arr[0] = first;
        for (int i = 1; i < encoded.length + 1; i++){
            arr[i] = arr[i - 1] ^ encoded[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
        DecodeXORedArray decodeXORedArray = new DecodeXORedArray();
        int[] decode = decodeXORedArray.decode(encoded, first);
        for (int n : decode) {
            System.out.println(n);
        }
    }
}
