import java.util.HashSet;

public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        /*
        * 我的方法不够严谨，没有考虑到注意
        * S 和 J 最多含有50个字母。
          J 中的字符不重复。
        * */
        int count=0;
        for (int i = 0; i < J.length(); i++) {
            char c = J.charAt(i);
            for (int j = 0; j < S.length(); j++) {
                char c1 = S.charAt(j);
                if (c == c1) {
                    count++;
                }
            }
        }
        return count;

        /*
        *作者：guanpengchn
        *方法大致相同，改用HashSet，HashSet是无序的，不可重复的。
        * */
        /*HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        int ans = 0;
        for(int i = 0; i < S.length(); i++) {
            if(set.contains(S.charAt(i))){
                ans++;
            }
        }
        return ans;*/
    }

    public static void main(String[] args) {
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        int i = jewelsAndStones.numJewelsInStones("aA", "aAAbbbb");
        System.out.println(i);
    }
}
