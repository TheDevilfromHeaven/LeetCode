public class TransposeMatrix {
    /*
    * 积累一个写的不错的方法
    * */
//    public int[][] transpose(int[][] matrix) {
//        int row = matrix.length , column = matrix[0].length;
//        int[][] res = new int[column][row];
//        for(int i = 0 ; i < row * column ; i ++){
//            res[i/row][i%row]  = matrix[i%row][i/row];
//        }
//        return res;
//    }

    public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length;j++){
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        TransposeMatrix transposeMatrix = new TransposeMatrix();
        int[][] transpose = transposeMatrix.transpose(matrix);
        for (int[] init : transpose) {
            for (int n : init) {
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
