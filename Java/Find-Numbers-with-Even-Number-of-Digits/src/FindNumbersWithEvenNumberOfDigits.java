public class FindNumbersWithEvenNumberOfDigits {
    /*
    * 作者：ChvR4fjWhT
      链接：https://leetcode-cn.com/problems/find-numbers-with-even-number-of-digits/solution/dui-shu-qiu-jie-log10-by-chvr4fjwht-ks03/
      来源：力扣（LeetCode）
    * 看到一种好的解法。
    * */
//    public int findNumbers(int[] nums) {
//        int x=0;
//        for(int i=0;i<nums.length;i++){
//            if((int)Math.log10(nums[i])%2==1){
//                x++;
//            }
//        }
//        return x;
//    }

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            int x = 0;
            for (int i = 1; i <= num; ){
                if (num / i != 0){
                    x++;
                    i *= 10;
                }
            }
            if (x % 2 == 0){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {100000};
        FindNumbersWithEvenNumberOfDigits findNumbersWithEvenNumberOfDigits = new FindNumbersWithEvenNumberOfDigits();
        int numbers = findNumbersWithEvenNumberOfDigits.findNumbers(nums);
        System.out.println(numbers);
    }
}
