public class IncreasingDecreasingString {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/increasing-decreasing-string/solution/shang-sheng-xia-jiang-zi-fu-chuan-by-leetcode-solu/
      来源：力扣（LeetCode）
    * 官方解法一
    * 解释下，把每个字符用一个数组来记录次数，用while循环排序，正序一遍倒序一遍，与原字符对比判断是否完成。
    * */
    public String sortString(String s) {
        int[] ints = new int[26];
        for (int i = 0; i < s.length(); i++){
            ints[s.charAt(i) - 'a']++;
        }
        StringBuffer res = new StringBuffer();
        while(res.length() < s.length()){
            for (int i = 0; i < 26; i++){
                if (ints[i] > 0){
                    res.append((char) (i + 'a'));
                    ints[i]--;
                }
            }
            for (int j = 25; j >= 0; j--){
                if (ints[j] > 0){
                    res.append((char) (j + 'a'));
                    ints[j]--;
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "aaaabbbbcccc";
        IncreasingDecreasingString increasingDecreasingString = new IncreasingDecreasingString();
        String s1 = increasingDecreasingString.sortString(s);
        System.out.println(s1);
    }
}
