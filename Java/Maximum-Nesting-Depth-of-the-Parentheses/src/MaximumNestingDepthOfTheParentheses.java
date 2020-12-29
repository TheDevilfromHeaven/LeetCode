public class MaximumNestingDepthOfTheParentheses {
    public int maxDepth(String s) {
        int result = 0,flag = 0;
        for(int i = 0; i < s.length(); i++){
            char a = s.charAt(i);
            if ('(' == a){
                flag++;
                if (flag > result){
                    result++;
                }
            }else if(')' == a){
                flag--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MaximumNestingDepthOfTheParentheses maximumNestingDepthOfTheParentheses = new MaximumNestingDepthOfTheParentheses();
        int i = maximumNestingDepthOfTheParentheses.maxDepth("1+(2*3)/(2-1)");
        System.out.println(i);
    }
}
