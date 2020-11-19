import java.util.Arrays;

public class MoveZeroes {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/move-zeroes/solution/yi-dong-ling-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方解法一，比较好理解。
    * */
//    public void moveZeroes(int[] nums) {
//        int n = nums.length, left = 0, right = 0;
//        while (right < n){
//            if (nums[right] != 0){
//                swap(nums,left,right);
//                left++;
//            }
//            right++;
//        }
//    }
//
//    public void swap(int[] nums, int left, int right) {
//        int temp = nums[left];
//        nums[left] = nums[right];
//        nums[right] = temp;
//    }

    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);
    }
}
