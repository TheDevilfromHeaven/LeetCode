import java.util.HashMap;
import java.util.Stack;

public class SplitAStringInBalancedStrings {
    /*贪心算法
    *作者：karua
    链接：https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/solution/java-tan-xin-suan-fa-by-nan-lin/
    来源：力扣（LeetCode）
    著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    *   public int balancedStringSplit(String s) {
        int num = 0;
        int res = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'L')
                num++;
            else
                num--;
            if(num == 0)
                res++;
        }
        return res;
    }
    */

    /*
    * 我使用的是栈，效率不如使用贪心算法。
    */
    public int balancedStringSplit(String s) {
        int result = 0;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i,i+1);
            if (stack.empty()) {
                stack.push(str);
            } else {
                if (str.equals(stack.lastElement())) {
                    stack.push(str);
                } else {
                    stack.pop();
                    if (stack.empty()) {
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SplitAStringInBalancedStrings splitAStringInBalancedStrings = new SplitAStringInBalancedStrings();
        int x = splitAStringInBalancedStrings.balancedStringSplit("RLLLLRRRRL");
        System.out.println(x);
    }
}
