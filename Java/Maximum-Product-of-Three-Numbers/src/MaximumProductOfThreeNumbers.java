import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int result1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int result2 = nums[0] * nums[1] * nums[nums.length - 1];
        return Math.max(result1,result2);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        MaximumProductOfThreeNumbers maximumProductOfThreeNumbers = new MaximumProductOfThreeNumbers();
        int i = maximumProductOfThreeNumbers.maximumProduct(nums);
        System.out.println(i);
    }
}
