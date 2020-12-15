import java.util.HashMap;

public class ContainsDuplicate {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/contains-duplicate/solution/cun-zai-zhong-fu-yuan-su-by-leetcode-sol-iedd/
      来源：力扣（LeetCode）
    * 官方解法一，我的方法太慢了。
    * */
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        int n = nums.length;
//        for (int i = 0; i < n - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                return true;
//            }
//        }
//        return false;
//    }

    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
            if (map.get(num) >= 2) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        boolean b = containsDuplicate.containsDuplicate(nums);
        System.out.println(b);
    }
}
