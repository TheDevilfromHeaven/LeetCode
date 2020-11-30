import java.util.Arrays;

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--){
            if (A[i - 2] + A[i - 1] > A[i]){
                return A[i - 2] + A[i - 1] + A[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] A = {1,2,2,4,18,8};
        LargestPerimeterTriangle largestPerimeterTriangle = new LargestPerimeterTriangle();
        int i = largestPerimeterTriangle.largestPerimeter(A);
        System.out.println(i);
    }
}
