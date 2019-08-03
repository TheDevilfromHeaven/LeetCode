public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        /*
        * 时间复杂度为O(n),不是最优解决方法
        * */
        int i;
        if (target == 0 || nums[0] == target) return 0;
        for ( i = 0; i < nums.length; i++) {
            if (nums[i] >= target) return i;
        }
        return i;

        /*
        * 参考别人的二分查找法
        * 时间复杂度为O(logn)
        * */
        /*int left = 0, right = nums.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;*/
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] x = {2,5};
        int i = searchInsertPosition.searchInsert(x, 6);
        System.out.println(i);
    }
}
