public class ConvertANumberToHexadecimal {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/solution/shu-zi-zhuan-huan-wei-shi-liu-jin-zhi-sh-2srt/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
//    public String toHex(int num) {
//        if (num == 0) {
//            return "0";
//        }
//        StringBuffer sb = new StringBuffer();
//        for (int i = 7; i >= 0; i --) {
//            int val = (num >> (4 * i)) & 0xf;
//            if (sb.length() > 0 || val > 0) {
//                char digit = val < 10 ? (char) ('0' + val) : (char) ('a' + val - 10);
//                sb.append(digit);
//            }
//        }
//        return sb.toString();
//    }

    public String toHex(int num) {
        return Integer.toHexString(num);
    }

    public static void main(String[] args) {
        int num = -1;
        String s = new ConvertANumberToHexadecimal().toHex(num);
        System.out.println(s);
    }
}
