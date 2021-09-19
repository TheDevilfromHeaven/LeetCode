import java.util.Arrays;

public class SmallestKLCCI {
    public int[] smallestK(int[] arr, int k) {
        int[] ints = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            ints[i] = arr[i];
        }
        return ints;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,2,4,6,8};
        int[] ints = new SmallestKLCCI().smallestK(arr, 4);
        for (int n : ints) {
            System.out.println(n);
        }
    }
}
