import java.util.LinkedList;

public class CountAndSay {
    /**
     *不会
     * 作者：javaeexgj
     * 链接：https://leetcode-cn.com/problems/two-sum/solution/dui-lie-fa-by-javaeexgj/
     */
    public String countAndSay(int n) {
        if(n==1) return "1";
        LinkedList<Integer> queue = new LinkedList<>();
        int count = 0;
        int temp;
        queue.addFirst(1);
        for (int i = 0; i < n - 1; i++) {
            temp = queue.getFirst();
            int len = queue.size();
            for (int j = 0; j < len; j++) {
                Integer poll = queue.poll();
                if (poll != temp) {
                    queue.addLast(count);
                    queue.addLast(temp);
                    temp = poll;
                    count = 1;
                } else {
                    count++;
                }
            }
            queue.addLast(count);
            queue.addLast(temp);
            count = 0;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Integer integer:
                queue) {
            stringBuffer.append(integer);
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        String s = countAndSay.countAndSay(5);
        System.out.println(s);
    }
}
