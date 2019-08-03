import java.util.HashMap;
import java.util.Stack;

public class RemoveOutermostParentheses {
    public String removeOuterParentheses(String S) {
        /**
         * Runtime: 8 ms, faster than 32.70% of Java online submissions for Remove Outermost Parentheses.
         * Memory Usage: 37.7 MB, less than 29.91% of Java online submissions for Remove Outermost Parentheses.
         *我这方法太慢了。。。
         */
        StringBuilder result = new StringBuilder();
        HashMap<Character, Character> maps = new HashMap<>();
        maps.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (!maps.containsKey(c)) {
                stack.push(c);
                if (stack.size() > 1) result.append(c);
            } else {
                if (stack.size() > 1) result.append(c);
                stack.pop();
            }
        }
        return result.toString();

        /**
         *别人的解法，比我的简单、速度快。
         */
        /*StringBuilder sb = new StringBuilder();
        int leftCount=0;
        for (int i=0;i<S.length();i++){
            char c = S.charAt(i);
            if(c=='(') {
                leftCount++;
                if (leftCount>1) sb.append(c);
            }
            else{
                leftCount--;
                if(leftCount>0)  sb.append(c);
            }
        }
        return sb.toString();*/
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses removeOutermostParentheses = new RemoveOutermostParentheses();
        String s = removeOutermostParentheses.removeOuterParentheses("()()");
        System.out.println(s);
    }
}
