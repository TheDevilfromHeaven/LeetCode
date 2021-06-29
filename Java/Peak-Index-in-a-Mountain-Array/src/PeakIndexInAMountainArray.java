public class PeakIndexInAMountainArray {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/peak-index-in-a-mountain-array/solution/shan-mai-shu-zu-de-feng-ding-suo-yin-by-dtqvv/
      来源：力扣（LeetCode）
    * 官方解法二，二分法。
    * */
//    public int peakIndexInMountainArray(int[] arr) {
//        int n = arr.length;
//        int left = 1, right = n - 2, ans = 0;
//        while (left <= right) {
//            int mid = (left + right) / 2;
//            if (arr[mid] > arr[mid + 1]) {
//                ans = mid;
//                right = mid - 1;
//            } else {
//                left = mid + 1;
//            }
//        }
//        return ans;
//    }

    public int peakIndexInMountainArray(int[] arr) {
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < arr[i - 1]){
                return i - 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        PeakIndexInAMountainArray peakIndexInAMountainArray = new PeakIndexInAMountainArray();
        int i = peakIndexInAMountainArray.peakIndexInMountainArray(arr);
        System.out.println(i);
    }
}
