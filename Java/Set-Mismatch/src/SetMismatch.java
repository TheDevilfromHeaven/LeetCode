public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] bucket = new int[nums.length + 1];
        for (int n : nums) {
            bucket[n]++;
        }
        for (int i = 0; i < nums.length + 1; i++){
            if (bucket[i] > 1){
                result[0] = i;
            }
            if (bucket[i] == 0){
                result[1] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        SetMismatch setMismatch = new SetMismatch();
        int[] errorNums = setMismatch.findErrorNums(nums);
        for (int n : errorNums) {
            System.out.println(n);
        }
    }
}
