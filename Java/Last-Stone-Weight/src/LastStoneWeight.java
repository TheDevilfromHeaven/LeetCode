import java.util.PriorityQueue;

public class LastStoneWeight {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/last-stone-weight/solution/zui-hou-yi-kuai-shi-tou-de-zhong-liang-b-xgsx/
      来源：力扣（LeetCode）
    * 官方解法一。积累一下。
    * */
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int stone : stones) {
            pq.offer(stone);
        }

        while (pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            if (a > b){
                pq.offer(a - b);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }

    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int i = lastStoneWeight.lastStoneWeight(stones);
        System.out.println(i);
    }
}
