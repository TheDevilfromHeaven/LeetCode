import java.util.ArrayList;
import java.util.List;

public class BinaryWatch {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/binary-watch/solution/er-jin-zhi-shou-biao-by-leetcode-solutio-3559/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> ans = new ArrayList<>();
        for (int h = 0; h < 12; h++){
            for (int m = 0; m < 60; m++){
                if (Integer.bitCount(h) + Integer.bitCount(m) == turnedOn){
                    ans.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int turnedOn = 1;
        BinaryWatch binaryWatch = new BinaryWatch();
        List<String> strings = binaryWatch.readBinaryWatch(turnedOn);
        for (String s : strings) {
            System.out.println(s);
        }
    }
}
