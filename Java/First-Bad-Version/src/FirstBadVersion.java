public class FirstBadVersion {
    public boolean isBadVersion(int version){
        int bad = 4;
        if (bad == version) return true;
        return false;
    }

    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/first-bad-version/solution/di-yi-ge-cuo-wu-de-ban-ben-by-leetcode-s-pf8h/
      来源：力扣（LeetCode）
    * 官方解法一，二分法。
    * */
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left < right){
            int flag = left + (right - left) / 2;
            if(isBadVersion(flag) == true){
                right = flag;
            }else{
                left = flag + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        int i = firstBadVersion.firstBadVersion(5);
        System.out.println(i);
    }
}
