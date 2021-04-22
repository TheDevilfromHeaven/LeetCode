public class PlusOne {
    /*
    *  作者：yhhzw
       链接：https://leetcode-cn.com/problems/plus-one/solution/java-shu-xue-jie-ti-by-yhhzw/
       来源：力扣（LeetCode）
    * 很好的方法。
    * */
    public int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; i--){
            digits[i]++;
            digits[i] = digits[i] % 10;
            if (digits[i] != 0) return digits;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        PlusOne plusOne = new PlusOne();
        int[] ints = plusOne.plusOne(digits);
        for (int n : ints) {
            System.out.println(n);
        }
    }
}
