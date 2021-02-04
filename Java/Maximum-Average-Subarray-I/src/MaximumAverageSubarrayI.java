import java.util.Arrays;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        //int sum = Arrays.stream(nums, 0, k).sum();这方法慢了点
        int sum = 0;
        for (int i = 0; i < k; i++){
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++){
            sum = sum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum,sum);
        }
        return 1.0 * maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,4,2};
        MaximumAverageSubarrayI maximumAverageSubarrayI = new MaximumAverageSubarrayI();
        double maxAverage = maximumAverageSubarrayI.findMaxAverage(nums,4);
        System.out.println(maxAverage);
    }
}
