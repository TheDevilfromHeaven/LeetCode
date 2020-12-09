public class DecompressRunLengthEncodedList {
    public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for (int y = 0; y < nums.length; ){
            sum += nums[y];
            y += 2;
        }
        int[] result = new int[sum];
        int i = 0;
        int index = 0;
        while (i < nums.length){
            for (int x = 0; x < nums[i]; x++){
                result[index] = nums[i + 1];
                index++;
            }
            i += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        DecompressRunLengthEncodedList decompressRunLengthEncodedList = new DecompressRunLengthEncodedList();
        int[] ints = decompressRunLengthEncodedList.decompressRLElist(nums);
        for (int x : ints) {
            System.out.println(x);
        }
    }
}
