import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    /*
    * 思路来源 830.较大分组的位置。
    * */
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int flay = 0;
        for (int i = 0; i < nums.length; i++){
            if (i == nums.length - 1 || nums[i] + 1 != nums[i + 1]){
                StringBuffer list = new StringBuffer();
                list.append(nums[i - flay]);
                if (flay != 0){
                    list.append("->");
                    list.append(nums[i]);
                }
                result.add(list.toString());
                flay = 0;
            }else {
                flay++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,4,5,7};
        SummaryRanges summaryRanges = new SummaryRanges();
        List<String> list = summaryRanges.summaryRanges(nums);
        for (String s : list) {
            System.out.println(s);
        }
    }
}
