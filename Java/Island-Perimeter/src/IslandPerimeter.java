public class IslandPerimeter {
//    作者：nettee
//    链接：https://leetcode-cn.com/problems/island-perimeter/solution/tu-jie-jian-ji-er-qiao-miao-de-dfs-fang-fa-java-by/
//    来源：力扣（LeetCode）
//    DFS深度优先搜索解法。
//    public int islandPerimeter(int[][] grid) {
//        for (int r = 0; r < grid.length; r++) {
//            for (int c = 0; c < grid[0].length; c++) {
//                if (grid[r][c] == 1) {
//                    // 题目限制只有一个岛屿，计算一个即可
//                    return dfs(grid, r, c);
//                }
//            }
//        }
//        return 0;
//    }
//
//    int dfs(int[][] grid, int r, int c) {
//        if (!(0 <= r && r < grid.length && 0 <= c && c < grid[0].length)) {
//            return 1;
//        }
//        if (grid[r][c] == 0) {
//            return 1;
//        }
//        if (grid[r][c] != 1) {
//            return 0;
//        }
//        grid[r][c] = 2;
//        return dfs(grid, r - 1, c)
//                + dfs(grid, r + 1, c)
//                + dfs(grid, r, c - 1)
//                + dfs(grid, r, c + 1);
//    }

    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0;i<grid.length;i++){
            for (int j = 0;j<grid[i].length;j++){
                if (grid[i][j] == 1){
                    //上
                    if (i == 0 || grid[i-1][j] == 0){
                        result++;
                    }
                    //下
                    if (i+1 == grid.length || grid[i+1][j] == 0){
                        result++;
                    }
                    //左
                    if (j-1 < 0 || grid[i][j-1] == 0){
                        result++;
                    }
                    //右
                    if (j+1 == grid[i].length || grid[i][j+1] == 0){
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        IslandPerimeter islandPerimeter = new IslandPerimeter();
        int result = islandPerimeter.islandPerimeter(grid);
        System.out.println(result);
    }
}
