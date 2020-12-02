public class XOROperationInAnArray {
    public int xorOperation(int n, int start) {
        int result = 0;
        for (int i = 0; i < n; i++){
            result ^= start + 2 * i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        int start = 5;
        XOROperationInAnArray xorOperationInAnArray = new XOROperationInAnArray();
        int i = xorOperationInAnArray.xorOperation(n, start);
        System.out.println(i);
    }
}
