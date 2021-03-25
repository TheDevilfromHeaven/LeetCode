public class MonotonicArray {
    /*
    * 作者：fuxuemingzhu
      链接：https://leetcode-cn.com/problems/monotonic-array/solution/liang-ci-bian-li-yu-yi-ci-bian-li-by-fux-qvw0/
      来源：力扣（LeetCode）
    * 积累一下。
    * */
//    public boolean isMonotonic(int[] A) {
//        boolean inc = true;
//        boolean dec = true;
//        for (int i = 1; i < A.length; ++i) {
//            if (A[i] < A[i - 1])
//                inc = false;
//            if (A[i] > A[i - 1])
//                dec = false;
//            if (!inc && !dec)
//                return false;
//        }
//        return true;
//    }

    public boolean isMonotonic(int[] A) {
        int n = A.length - 1;
        int flag = 0;
        for (int i = 1; i < A.length; i++){
            if (A[i] > A[i - 1]){
                flag++;
            }else if(A[i] == A[i - 1]){
                n--;
            }else {
                flag--;
            }
        }
        flag = Math.abs(flag);
        if (flag == n) return true;
        return false;
    }

    public static void main(String[] args) {
        int[] A = {1,2,2,3};
        MonotonicArray monotonicArray = new MonotonicArray();
        boolean monotonic = monotonicArray.isMonotonic(A);
        System.out.println(monotonic);
    }
}
