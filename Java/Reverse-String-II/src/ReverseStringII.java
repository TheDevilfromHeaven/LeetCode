public class ReverseStringII {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/reverse-string-ii/solution/fan-zhuan-zi-fu-chuan-ii-by-leetcode-sol-ua7s/
      来源：力扣（LeetCode）
    * 官方解法一的改版
    * */
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int len = s.length();
        int left = 0;
        int right = 0;
        char temp;
        for (int i = 0; i < len; i += 2 * k) {
            left = i;
            right = Math.min(i + k, len) - 1;
            while (left < right){
                temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = new ReverseStringII().reverseStr("abcd", 4);
        System.out.println(s);
    }
}
