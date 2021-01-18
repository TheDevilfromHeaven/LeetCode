public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        for (int i = 1; i < coordinates.length - 1; i++){
            int res1 = (coordinates[i][1] - coordinates[i - 1][1]) * (coordinates[i + 1][0] - coordinates[i][0]);
            int res2 = (coordinates[i + 1][1] - coordinates[i][1]) * (coordinates[i][0] - coordinates[i - 1][0]);
            if(res1 != res2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] coordinatest = {{0,0},{0,1},{0,-1}};
        CheckIfItIsAStraightLine checkIfItIsAStraightLine = new CheckIfItIsAStraightLine();
        boolean b = checkIfItIsAStraightLine.checkStraightLine(coordinatest);
        System.out.println(b);
    }
}
