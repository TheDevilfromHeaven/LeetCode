import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int[] ints = new int[nums.length + 1];
        for (int n : nums) ints[n]++;
        for(int i = 1; i <= nums.length; i++){
            if (ints[i] == 0)result.add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray = new FindAllNumbersDisappearedInAnArray();
        List<Integer> disappearedNumbers = findAllNumbersDisappearedInAnArray.findDisappearedNumbers(nums);
        System.out.println(disappearedNumbers);
    }
}
