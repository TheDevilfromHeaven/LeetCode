public class CanPlaceFlowers {
    /*
    * 作者：hatsune-miku-k
      链接：https://leetcode-cn.com/problems/can-place-flowers/solution/fei-chang-jian-dan-de-tiao-ge-zi-jie-fa-nhzwc/
      来源：力扣（LeetCode）
    * 作者思路很好，没能做出很可惜。
    * */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0, len = flowerbed.length; i < len && n > 0;) {
            if (flowerbed[i] == 1) {
                i += 2;
            } else if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                n--;
                i += 2;
            } else {
                i += 3;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1};
        CanPlaceFlowers canPlaceFlowers = new CanPlaceFlowers();
        boolean b = canPlaceFlowers.canPlaceFlowers(flowerbed, 1);
        System.out.println(b);
    }
}
