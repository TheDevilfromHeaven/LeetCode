import java.util.LinkedList;
import java.util.Stack;

public class CountAndSay {
    public String countAndSay(int n) {
        /*
        * 不会，这是别人的方法
        * 使用的是队列法，难以理解
        * */
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
        String s = countAndSay.countAndSay(4);
        System.out.println(s);
    }
}
