import java.util.HashMap;

public class IsomorphicStrings {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/isomorphic-strings/solution/tong-gou-zi-fu-chuan-by-leetcode-solutio-s6fd/
      来源：力扣（LeetCode）
    * 官方解法一
    * */
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> s2t = new HashMap<>();
        HashMap<Character, Character> t2s = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i), y = t.charAt(i);
            if ((s2t.containsKey(x) && s2t.get(x) != y) || (t2s.containsKey(y) && t2s.get(y) != x)){
                return false;
            }
            s2t.put(x,y);
            t2s.put(y,x);
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();
        boolean isomorphic = isomorphicStrings.isIsomorphic(s, t);
        System.out.println(isomorphic);
    }
}
