import java.util.ArrayList;

public class CreateTargetArrayInTheGivenOrder {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/create-target-array-in-the-given-order/solution/an-ji-ding-shun-xu-chuang-jian-mu-biao-shu-zu-by-l/
      来源：力扣（LeetCode）
    * 官方解法一
    * */
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i++){
            list.add(index[i],nums[i]);
        }
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            ret[i] = list.get(i);
        }
        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        CreateTargetArrayInTheGivenOrder createTargetArrayInTheGivenOrder = new CreateTargetArrayInTheGivenOrder();
        int[] targetArray = createTargetArrayInTheGivenOrder.createTargetArray(nums, index);
        for (int i : targetArray){
            System.out.println(i);
        }
    }
}
