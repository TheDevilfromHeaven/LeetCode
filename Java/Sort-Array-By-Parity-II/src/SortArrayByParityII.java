public class SortArrayByParityII {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/sort-array-by-parity-ii/solution/an-qi-ou-pai-xu-shu-zu-ii-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方解法二，很棒。
    * */
//    public int[] sortArrayByParityII(int[] A) {
//        int n = A.length;
//        int j = 1;
//        for (int i = 0; i < n; i += 2) {
//            if (A[i] % 2 == 1) {
//                while (A[j] % 2 == 1) {
//                    j += 2;
//                }
//                swap(A, i, j);
//            }
//        }
//        return A;
//    }
//
//    public void swap(int[] A, int i, int j) {
//        int temp = A[i];
//        A[i] = A[j];
//        A[j] = temp;
//    }

    public int[] sortArrayByParityII(int[] A) {
        int[] result = new int[A.length];
        int odd = 1,even = 0;
        for (int i = 0;i<A.length;i++){
            if (A[i] % 2 == 0){
                result[even] = A[i];
                even += 2;
            }else {
                result[odd] = A[i];
                odd += 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] A = {4,2,5,7};
        SortArrayByParityII sortArrayByParityII = new SortArrayByParityII();
        int[] ints = sortArrayByParityII.sortArrayByParityII(A);
        for (int x : ints) {
            System.out.println(x);
        }
    }
}
