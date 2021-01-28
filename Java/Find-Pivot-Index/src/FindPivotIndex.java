import java.util.Arrays;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int result = -1;
        int right = Arrays.stream(nums).sum();
        int left = 0;
        for (int i = 0; i < nums.length; i++){
            if (left == right - nums[i] - left){
                return i;
            }
            left += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        int i = findPivotIndex.pivotIndex(nums);
        System.out.println(i);
    }
}
