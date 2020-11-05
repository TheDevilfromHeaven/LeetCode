public class ReverseString {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/reverse-string/solution/fan-zhuan-zi-fu-chuan-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方解法
    * */
//    public void reverseString(char[] s) {
//        int n = s.length;
//        for (int left = 0, right = n - 1; left < right; ++left, --right) {
//            char tmp = s[left];
//            s[left] = s[right];
//            s[right] = tmp;
//        }
//    }

    public void reverseString(char[] s) {
        int head = 0;
        int end = s.length - 1;
        char rev;
        while (head < end){
            rev = s[head];
            s[head] = s[end];
            s[end] = rev;
            head++;
            end--;
        }
    }

    public static void main(String[] args) {
        char[] s = {72,97,110,110,97,104};
        ReverseString reverseString = new ReverseString();
        reverseString.reverseString(s);
    }
}
