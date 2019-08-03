import java.util.HashMap;

public class RemoveElement {
    /*
    * 这道与Remove-Duplicates-from-Sorted-Array很相似不过要注意
    * 1、i++的位置
    * 2、return返回的是i
    * 3、if对比的是val
    * 4、j是从0开始
    * */
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveElement remove = new RemoveElement();
        int[] x = {3, 2, 2, 3};
        remove.removeElement(x, 3);
    }
}
