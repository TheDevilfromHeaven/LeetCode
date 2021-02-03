public class ReplaceElementsWithGreatestElementOnRightSide {
    public int[] replaceElements(int[] arr) {
        int[] result = new int[arr.length];
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--){
            result[i] = max;
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        ReplaceElementsWithGreatestElementOnRightSide replaceElementsWithGreatestElementOnRightSide = new ReplaceElementsWithGreatestElementOnRightSide();
        int[] ints = replaceElementsWithGreatestElementOnRightSide.replaceElements(arr);
        for (int n : ints) {
            System.out.println(n);
        }
    }
}
