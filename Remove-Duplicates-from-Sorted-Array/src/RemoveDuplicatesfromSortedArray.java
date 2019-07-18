public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        /*
        * 官方答案
        * 使用过HasHSet,可是由于返回类型为int，于是失败了。
        * 不明白为什么返回数值是整数，但输出的答案是数组，有没有大神给我解答一下。
        * */
        if(nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray = new RemoveDuplicatesfromSortedArray();
        int[] x = {1,1,2};
        removeDuplicatesfromSortedArray.removeDuplicates(x);
    }
}
