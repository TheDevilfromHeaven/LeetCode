public class RelativeSortArray {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/relative-sort-array/solution/shu-zu-de-xiang-dui-pai-xu-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 没做出来，官方方法二。
    * */
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int upper = 0;
        for (int x : arr1) {
            upper = Math.max(upper,x);
        }
        int[] frequency = new int[upper + 1];
        for (int x : arr1){
            ++frequency[x];
        }
        int[] res = new int[arr1.length];
        int index = 0;
        for (int x: arr2){
            for (int j = 0;j<frequency[x];j++){
                res[index++] = x;
            }
            frequency[x] = 0;
        }
        for (int i = 0;i<=upper;i++){
            for (int j = 0;j < frequency[i];j++){
                res[index++] = i;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
        RelativeSortArray relativeSortArray = new RelativeSortArray();
        int[] ints = relativeSortArray.relativeSortArray(arr1, arr2);
        for (int x : ints) {
            System.out.println(x);
        }
    }
}
