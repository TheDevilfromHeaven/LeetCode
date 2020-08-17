public class RunningSumOf1dArray {
    /*
    * 看到的最简单的方法
    * */
//    public int[] runningSumOf1dArray(int[] nums){
//        for (int i = 1; i<nums.length;i++){
//            nums[i] += nums[i-1];
//        }
//        return nums;
//    }

    /*
    * 遍历数组，取值运算
    * */
    public int[] runningSumOf1dArray(int[] nums){
        int[] result= new int[nums.length];
        int y = 0;
        for (int i = 0;i<nums.length;i++){
            int x = nums[i];
            y = y + x;
            result[i] = y;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        RunningSumOf1dArray runningSumOf1dArray = new RunningSumOf1dArray();
        int[] show =runningSumOf1dArray.runningSumOf1dArray(num);
        for (int out:show) {
            System.out.println(out);
        }
    }
}
