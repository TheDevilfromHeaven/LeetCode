public class ConstructTheRectangle {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/construct-the-rectangle/solution/gou-zao-ju-xing-by-leetcode-solution-dest/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area);
        while (area % W != 0){
            W--;
        }
        return new int[]{area / W , W};
    }

    public static void main(String[] args) {
        int area = 4;
        int[] ints = new ConstructTheRectangle().constructRectangle(area);
        for (int n : ints) {
            System.out.println(n);
        }
    }
}
