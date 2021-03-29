public class RemoveAllAdjacentDuplicatesInString {
    /*
    * 作者：AC_OIer
      链接：https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/solution/cong-30-dao-100wu-chong-shi-xian-jie-jue-vkah/
      来源：力扣（LeetCode）
    * 纯数组解法
    * */
//    public String removeDuplicates(String s) {
//        char[] cs = s.toCharArray();
//        char[] d = new char[s.length()];
//        int hh = 0, tt = -1;
//        for (char c : cs) {
//            if (hh <= tt && d[tt] == c) {
//                tt--;
//            } else {
//                d[++tt] = c;
//            }
//        }
//        return new String(d, 0, tt + 1);
//    }

    public String removeDuplicates(String S) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < S.length(); i++){
            char c = S.charAt(i);
            if (stringBuffer.length() == 0 || stringBuffer.charAt(stringBuffer.length() - 1) != c){
                stringBuffer.append(c);
            }else{
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString removeAllAdjacentDuplicatesInString = new RemoveAllAdjacentDuplicatesInString();
        String s = removeAllAdjacentDuplicatesInString.removeDuplicates("abbaca");
        System.out.println(s);
    }
}
