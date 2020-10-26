import java.util.*;

public class TopKFrequentElements {
    /*
    * 作者：byakuya-2
      链接：https://leetcode-cn.com/problems/top-k-frequent-elements/solution/hashmapgen-ju-valuezhi-pai-xu-ji-bai-52-by-byakuya/
      来源：力扣（LeetCode）
    * */
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[k];
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //根据value排序
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] ints = topKFrequentElements.topKFrequent(nums, k);
        for (int n:ints) {
            System.out.println(n);
        }
    }
}
