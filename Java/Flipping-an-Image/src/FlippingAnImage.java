public class FlippingAnImage {
    public int[][] flipAndInvertImage(int[][] A) {
        /**
         * 存在问题，new数组B处很容易出问题。
         */
        int[][] B = new int[A.length][A.length];
        for (int i = 0;i<A.length;i++){
            int x = 0;
            for (int j = A[i].length-1;j >= 0;j--){
                if(A[i][j] == 1) B[i][x] = 0;
                else B[i][x] = 1;
                x++;
            }
        }
        return B;

        /**
         * 官方解法
         */
        /*int C = A[0].length;
        for (int[] row: A)
            for (int i = 0; i < (C + 1) / 2; ++i) {
                int tmp = row[i] ^ 1;
                row[i] = row[C - 1 - i] ^ 1;
                row[C - 1 - i] = tmp;
            }
        return A;*/
    }

    public static void main(String[] args) {
        FlippingAnImage flippingAnImage = new FlippingAnImage();
        int[][] ints = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] ints1 = flippingAnImage.flipAndInvertImage(ints);
        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < ints1.length; j++) {
                System.out.println(ints1[i][j]);
            }
        }
    }
}
