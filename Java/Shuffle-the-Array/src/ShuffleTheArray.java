public class ShuffleTheArray {
    /*
    * 两种方法，思路都一样的。
    * */
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0;
        for (int j = 0; j < n; j++){
            result[i++] = nums[j];
            result[i++] = nums[n + j];
        }
        return result;
    }

//    public int[] shuffle(int[] nums, int n) {
//        int[] result = new int[nums.length];
//        int i = 0,j = n;
//        int index = 0;
//        while (i < n && j < nums.length){
//            result[index] = nums[i];
//            result[index + 1] = nums[j];
//            i++;
//            j++;
//            index += 2;
//        }
//        return result;
//    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        int[] shuffle = shuffleTheArray.shuffle(nums, n);
        for (int x : shuffle) {
            System.out.println(x);
        }
    }
}
