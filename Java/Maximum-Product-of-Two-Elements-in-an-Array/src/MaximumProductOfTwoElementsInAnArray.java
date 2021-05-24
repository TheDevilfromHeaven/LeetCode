import java.util.Arrays;

public class MaximumProductOfTwoElementsInAnArray {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length - 1] - 1) * (nums[nums.length - 2] - 1);
    }

    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        MaximumProductOfTwoElementsInAnArray maximumProductOfTwoElementsInAnArray = new MaximumProductOfTwoElementsInAnArray();
        int i = maximumProductOfTwoElementsInAnArray.maxProduct(nums);
        System.out.println(i);
    }
}
