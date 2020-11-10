import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindCommonCharacters {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/find-common-characters/solution/cha-zhao-chang-yong-zi-fu-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 没写出来，官方解法，写写注解思路吧。
    * */
    public List<String> commonChars(String[] A) {
        int[] minfreq = new int[26];
        //把数组默认值0全替换为int最大值。
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        //遍历字符串组。
        for (String word: A) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; ++i) {
                char ch = word.charAt(i);
                //记录a-z出现次数。
                ++freq[ch - 'a'];
            }
            for (int i = 0; i < 26; ++i) {
                //把数组的值替换成a-z出现次数。记录小的。
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }

        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minfreq[i]; ++j) {
                //minfreq[i]根据次数添加字母。
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] A = {"bella","label","roller"};
        FindCommonCharacters findCommonCharacters = new FindCommonCharacters();
        List<String> list = findCommonCharacters.commonChars(A);
        for (String x:list) {
            System.out.println(x);
        }
    }
}
