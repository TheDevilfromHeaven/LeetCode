public class ValidMountainArray {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/valid-mountain-array/solution/you-xiao-de-shan-mai-shu-zu-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 记录一下官方解法。
    * */
//    public boolean validMountainArray(int[] A) {
//        int N = A.length;
//        int i = 0;
//
//        // 递增扫描
//        while (i + 1 < N && A[i] < A[i + 1]) {
//            i++;
//        }
//
//        // 最高点不能是数组的第一个位置或最后一个位置
//        if (i == 0 || i == N - 1) {
//            return false;
//        }
//
//        // 递减扫描
//        while (i + 1 < N && A[i] > A[i + 1]) {
//            i++;
//        }
//
//        return i == N - 1;
//    }

    public boolean validMountainArray(int[] A) {
        if (A.length < 3) return false;
        int i = 0;
        for (;i<A.length-1;i++){
            if (A[i] >= A[i+1]) break;
        }
        int j = A.length-1;
        for (;j>1;j--){
            if (A[j - 1] <= A[j]) break;
        }
        if (i == j && i != A.length-1 && j != 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] A = {0,1,2,3,4,5,6,7,8,9};
        ValidMountainArray validMountainArray = new ValidMountainArray();
        boolean b = validMountainArray.validMountainArray(A);
        System.out.println(b);
    }
}
