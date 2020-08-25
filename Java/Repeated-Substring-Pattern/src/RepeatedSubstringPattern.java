import java.util.LinkedList;
import java.util.Queue;

public class RepeatedSubstringPattern {
    /*
    * 作者：leetcoder-youzg
    链接：https://leetcode-cn.com/problems/repeated-substring-pattern/solution/java-yi-xing-dai-ma-jie-jue-zhong-fu-zi-chuan-wen-/
    来源：力扣（LeetCode）
    * 大佬nb
    * */
    public boolean repeatedSubstringPattern(String s) {
        return (s+s).substring(1, 2 * s.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        String arg = "abaababaab";
        RepeatedSubstringPattern repeatedSubstringPattern = new RepeatedSubstringPattern();
        boolean b = repeatedSubstringPattern.repeatedSubstringPattern(arg);
        System.out.println(b);
    }
}
