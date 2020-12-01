import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int i = 0; i < candies.length; i++){
            max = Math.max(max,candies[i]);
        }
        ArrayList<Boolean> result = new ArrayList<>();
        for (int i = 0; i < candies.length; i++){
            result.add(candies[i] + extraCandies >= max);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        KidsWithTheGreatestNumberOfCandies kidsWithTheGreatestNumberOfCandies = new KidsWithTheGreatestNumberOfCandies();
        List<Boolean> booleans = kidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies);
        for (Boolean i: booleans) {
            System.out.println(i);
        }
    }
}
