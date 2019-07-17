import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    /*
    * 水平不够，做不出来
    * 以下是他人的解法。
    * */
    public boolean isValid(String s) {
        /*HashMap映射右括号*/
        HashMap<Character, Character> maps = new HashMap<Character, Character>();
        maps.put(')', '(');
        maps.put(']', '[');
        maps.put('}', '{');
        /*使用栈*/
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            /*判断是否与map里的key相同，不相同的进栈*/
            if (maps.containsKey(c)) {
                /*对比栈。空或栈顶的值与map不相同返回false*/
                if (stack.empty() || stack.pop() != maps.get(c)) return false;
            } else
                stack.push(c);
        }
        /*栈为空返回true，否则为false*/
        return stack.empty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        Boolean result = validParentheses.isValid("()");
        System.out.println(result);
    }
}
