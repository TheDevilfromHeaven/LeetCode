public class CheckIfAllTheIntegersInARangeAreCovered {
    /*
    * 作者：LaoGanMaIsEverything
      链接：https://leetcode-cn.com/problems/check-if-all-the-integers-in-a-range-are-covered/solution/yi-ti-san-jie-bao-li-you-hua-chai-fen-by-w7xv/
      来源：力扣（LeetCode）
    * 解法1：暴力
    * */
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] booleans = new boolean[51];
        for (int[] range : ranges){
            for (int i = range[0]; i <= range[1]; i++){
                booleans[i] = true;
            }
        }
        for (int i = left; i <= right; i++){
            if (booleans[i] == false) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][]  ranges = {{1,2}, {3,4}, {5,6}};
        boolean covered = new CheckIfAllTheIntegersInARangeAreCovered().isCovered(ranges, 2, 5);
        System.out.println(covered);
    }
}
