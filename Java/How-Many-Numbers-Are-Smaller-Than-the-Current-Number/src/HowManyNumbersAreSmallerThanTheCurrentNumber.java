public class HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
//        积累一个解法。
//        作者：leetcoder-youzg
//        链接：https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/solution/java-ji-shu-fa-jian-dan-gao-xiao-jie-jue-xiao-yu-d/
//        来源：力扣（LeetCode）
//        if (nums == null || nums.length <= 1) {
//            return nums;
//        }
//
//        int length = nums.length;
//        int[] result = new int[length];
//        int[] counter = new int[101];   // 出现的数字 的范围：0~100，共101个
//
//        /*
//            将 nums数组中的数字 作为下标，记录每个数字的出现次数
//         */
//        for (int i = 0; i < length; i++) {
//            counter[nums[i]]++;
//            System.out.println(counter[nums[i]]);
//        }
//
//        /*
//            计算比 当前数字 小的 nums数组中的元素 的个数
//         */
//        for (int i = 1; i <= 100; i++) {
//            counter[i] += counter[i - 1];
//            System.out.println(counter[i]);
//        }
//
//        /*
//            根据 计数数组 生成 结果数组
//         */
//        for (int i = 0; i < length; i++) {
//            /*
//                counter数组记录的是，包含自身在内的，比自己小的元素个数
//                因此，result[i] = counter[nums[i] - 1]
//             */
//            result[i] = nums[i] == 0 ? 0 : counter[nums[i] - 1];
//        }
//
//        return result;

        int[] result = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            int count = 0;
            for (int j = 0;j<nums.length;j++){
                if (nums[i] > nums[j] && i != j){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] x = {8,1,2,2,3};
        HowManyNumbersAreSmallerThanTheCurrentNumber howManyNumbersAreSmallerThanTheCurrentNumber = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        int[] ints = howManyNumbersAreSmallerThanTheCurrentNumber.smallerNumbersThanCurrent(x);
        for (int num : ints){
            System.out.println(num);
        }
    }
}
