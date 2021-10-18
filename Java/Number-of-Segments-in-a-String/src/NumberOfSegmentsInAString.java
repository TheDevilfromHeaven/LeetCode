public class NumberOfSegmentsInAString {
    /*
    * 作者：lcbin
      链接：https://leetcode-cn.com/problems/number-of-segments-in-a-string/solution/split-qie-fen-huo-zhe-zhi-jie-bian-li-ji-iqf2/
      来源：力扣（LeetCode）
    * */
    public int countSegments(String s) {
        int res = 0;
        for (String t : s.split(" ")) {
            if (!"".equals(t)) {
                ++res;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int i = new NumberOfSegmentsInAString().countSegments(", , , ,        a, eaefa");
        System.out.println(i);
    }
}
