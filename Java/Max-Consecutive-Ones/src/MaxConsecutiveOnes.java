public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int index = 0;
        for (int n : nums) {
            if (n == 1){
                index++;
            }else {
                if (result < index){
                    result = index;
                }
                index = 0;
            }
        }
        return Math.max(index,result);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();
        int maxConsecutiveOnes1 = maxConsecutiveOnes.findMaxConsecutiveOnes(nums);
        System.out.println(maxConsecutiveOnes1);
    }
}
