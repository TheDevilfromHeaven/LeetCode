import java.util.ArrayList;
import java.util.Arrays;

public class ValidAnagram {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/valid-anagram/solution/you-xiao-de-zi-mu-yi-wei-ci-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        char[] str1 = s.toCharArray();
//        char[] str2 = t.toCharArray();
//        Arrays.sort(str1);
//        Arrays.sort(str2);
//        return Arrays.equals(str1, str2);
//    }

    /*
    * 想法是重新排序参数，比较是否相同。
    * 看官方解法一，了解到Arrays.sort也可以对char[]数组进行排序。
    * */
    public boolean isAnagram(String s, String t) {
        int[] sInt = new int[26];
        int[] tInt = new int[26];
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            ++sInt[c - 'a'];
        }
        for (int j = 0; j < t.length(); j++){
            char c = t.charAt(j);
            ++tInt[c - 'a'];
        }
        StringBuffer newS = new StringBuffer();
        StringBuffer newT = new StringBuffer();
        for(int i = 0; i < sInt.length; i++){
            for (int j = 0; j < sInt[i]; j++){
                newS.append((char)(i + 'a'));
            }
        }
        for(int i = 0; i < tInt.length; i++){
            for (int j = 0; j < tInt[i]; j++){
                newT.append((char)(i + 'a'));
            }
        }
        return newS.toString().equals(newT.toString());
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        ValidAnagram validAnagram = new ValidAnagram();
        boolean anagram = validAnagram.isAnagram(s, t);
        System.out.println(anagram);
    }
}
