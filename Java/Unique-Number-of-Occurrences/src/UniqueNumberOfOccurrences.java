import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumberOfOccurrences {
    /*
    * 作者：sdwwld
      链接：https://leetcode-cn.com/problems/unique-number-of-occurrences/solution/3chong-jie-jue-fang-shi-by-sdwwld-3/
      来源：力扣（LeetCode）
      积累一种写法。
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map.size() == new HashSet<>(map.values()).size();
    * */

    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        for (int i = 0;i<list.size();i++){
            for (int j = i+1;j<list.size();j++){
                if (list.get(i).getValue() == list.get(j).getValue()){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] x = {-3,0,1,-3,1,1,1,-3,10,0};
        UniqueNumberOfOccurrences uniqueNumberOfOccurrences = new UniqueNumberOfOccurrences();
        boolean b = uniqueNumberOfOccurrences.uniqueOccurrences(x);
        System.out.println(b);
    }
}
