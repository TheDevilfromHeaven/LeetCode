public class FindTheDifference {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/find-the-difference/solution/zhao-bu-tong-by-leetcode-solution-mtqf/
      来源：力扣（LeetCode）
    * 官方解法二，思路很清晰。
    * */
//    public char findTheDifference(String s, String t) {
//        int as = 0, at = 0;
//        for (int i = 0; i < s.length(); ++i) {
//            as += s.charAt(i);
//        }
//        for (int i = 0; i < t.length(); ++i) {
//            at += t.charAt(i);
//        }
//        return (char) (at - as);
//    }

    public char findTheDifference(String s, String t) {
        if ("".equals(s)) return t.charAt(0);
        int[] chars = new int[26];
        for (int i = 0; i < t.length(); i++){
            chars[t.charAt(i) - 'a']++;
        }
        for (int j = 0; j < s.length(); j++){
            chars[s.charAt(j) - 'a']--;
        }
        char result = ' ';
        for (int x = 0; x < chars.length; x++){
            if (chars[x] > 0) return result = (char) (x + 'a');
        }
        return result;
    }

    public static void main(String[] args) {
        FindTheDifference findTheDifference = new FindTheDifference();
        char theDifference = findTheDifference.findTheDifference("abcd", "abcde");
        System.out.println(theDifference);
    }
}
