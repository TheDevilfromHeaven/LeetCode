import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IntersectionOfTwoArrays {
    /*
    * 在评论区看到一个用时比较少的方法，记录一下。
    * */
//    public int[] intersection(int[] nums1, int[] nums2) {
//        if (nums1 == null || nums2 == null) {
//            return null;
//        }
//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2 = new HashSet<>();
//        for (int item : nums1) {
//            set1.add(item);
//        }
//
//        for (int item : nums2) {
//            if (set1.contains(item)) {
//                set2.add(item);
//            }
//        }
//
//        int[] result = new int[set2.size()];
//        int start = 0;
//        for (int item : set2) {
//            result[start] = item;
//            start++;
//        }
//        return result;
//    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hashSet = new HashSet();
        for (int i = 0;i<nums1.length;i++) {
            for (int j = 0;j<nums2.length;j++){
                if (nums1[i] == nums2[j]){
                    hashSet.add(nums1[i]);
                }
            }
        }
        Iterator result = hashSet.iterator();
        int[] ints = new int[hashSet.size()];
        for (int x = 0;x<hashSet.size();x++){
            ints[x] = (int) result.next();
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int[] intersection = intersectionOfTwoArrays.intersection(nums1, nums2);
        for (int n : intersection) {
            System.out.println(n);
        }
    }
}
