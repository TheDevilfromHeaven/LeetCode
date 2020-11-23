public class LongPressedName {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/long-pressed-name/solution/chang-an-jian-ru-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方解法一，我也是想的双指针，很可惜还是差一点。
    * */
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j <= typed.length() - 1){
            if (i < name.length() && name.charAt(i) == typed.charAt(j)){
                i++;
                j++;
            }else if(j > 0 && typed.charAt(j) == typed.charAt(j - 1)){
                j++;
            }else {
                return false;
            }
        }
        return i == name.length();
    }

    public static void main(String[] args) {
        String name = "saeed";
        String typed = "ssaaedd";
        LongPressedName longPressedName = new LongPressedName();
        boolean longPressedName1 = longPressedName.isLongPressedName(name, typed);
        System.out.println(longPressedName1);
    }
}
