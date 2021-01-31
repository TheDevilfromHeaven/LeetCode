public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int now = 0;
        int max = 0;
        for (int n : gain){
            now = n + now;
            max = Math.max(now,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        FindTheHighestAltitude findTheHighestAltitude = new FindTheHighestAltitude();
        int i = findTheHighestAltitude.largestAltitude(gain);
        System.out.println(i);
    }
}
