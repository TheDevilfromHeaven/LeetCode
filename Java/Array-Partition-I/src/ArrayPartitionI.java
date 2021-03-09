import java.util.Arrays;

public class ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2){
            result += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        ArrayPartitionI arrayPartitionI = new ArrayPartitionI();
        int i = arrayPartitionI.arrayPairSum(nums);
        System.out.println(i);
    }
}
