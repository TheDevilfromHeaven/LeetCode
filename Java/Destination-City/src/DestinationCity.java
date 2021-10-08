import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DestinationCity {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/destination-city/solution/lu-xing-zhong-dian-zhan-by-leetcode-solu-pscd/
      来源：力扣（LeetCode）
    * 官方解法一。
    *  */
    public String destCity(List<List<String>> paths) {
        HashSet<String> citiesA = new HashSet<>();
        for (List<String> path : paths){
            citiesA.add(path.get(0));
        }
        for (List<String> path : paths){
            if (!citiesA.contains(path.get(1))){
                return path.get(1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        List<List<String>> paths = new ArrayList<List<String>>();
        List<String> strings = new ArrayList<String>();
        strings.add("London");
        strings.add("New York");
        List<String> strings2 = new ArrayList<String>();
        strings2.add("New York");
        strings2.add("Lima");
        List<String> strings3 = new ArrayList<String>();
        strings3.add("Lima");
        strings3.add("Sao Paulo");
        paths.add(strings);
        paths.add(strings2);
        paths.add(strings3);
        String s = new DestinationCity().destCity(paths);
        System.out.println(s);
    }
}
