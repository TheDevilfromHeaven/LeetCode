import java.util.Stack;

public class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        S = split(S);
        T = split(T);
        return S.equals(T);
    }

    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/backspace-string-compare/solution/bi-jiao-han-tui-ge-de-zi-fu-chuan-by-leetcode-solu/
      来源：力扣（LeetCode）
    * 官方的方法一。我的方法太慢了。
    * */
//    public String build(String str) {
//        StringBuffer ret = new StringBuffer();
//        int length = str.length();
//        for (int i = 0; i < length; ++i) {
//            char ch = str.charAt(i);
//            if (ch != '#') {
//                ret.append(ch);
//            } else {
//                if (ret.length() > 0) {
//                    ret.deleteCharAt(ret.length() - 1);
//                }
//            }
//        }
//        return ret.toString();
//    }

    public String split(String str){
        Stack<String> res = new Stack<>();
        for (int i = 0;i<str.length();i++) {
            if (str.substring(i,i+1).equals("#")){
                if (res.isEmpty()){
                    continue;
                }else {
                    res.pop();
                }
            }else {
                res.push(str.substring(i,i+1));
            }
        }
        String s = res.toString();
        return s;
    }

    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        BackspaceStringCompare backspaceStringCompare = new BackspaceStringCompare();
        boolean b = backspaceStringCompare.backspaceCompare(S, T);
        System.out.println(b);
    }
}
