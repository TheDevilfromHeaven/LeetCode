import java.util.Arrays;

public class MergeSortedArray {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m;
        for (int j = 0; j < n; j++){
            nums1[index] = nums2[j];
            index++;
        }
        Arrays.sort(nums1);
        return nums1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] merge = mergeSortedArray.merge(nums1, m, nums2, n);
        for (int s :
                merge) {
            System.out.println(s);
        }
    }
}
