import java.util.HashMap;

public class RobotReturnToOrigin {
//    作者：LeetCode-Solution
//    链接：https://leetcode-cn.com/problems/robot-return-to-origin/solution/ji-qi-ren-neng-fou-fan-hui-yuan-dian-by-leetcode-s/
//    来源：力扣（LeetCode）
//    public boolean judgeCircle(String moves) {
//        int x = 0, y = 0;
//        int length = moves.length();
//        for (int i = 0; i < length; i++) {
//            char move = moves.charAt(i);
//            if (move == 'U') {
//                y--;
//            } else if (move == 'D') {
//                y++;
//            } else if (move == 'L') {
//                x--;
//            } else if (move == 'R') {
//                x++;
//            }
//        }
//        return x == 0 && y == 0;
//    }

    /*
    * 与官方想法大致相同，但在结果却完败。
    * */
    public boolean judgeCircle(String moves) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("L",1);
        map.put("R",-1);
        map.put("U",1);
        map.put("D",-1);
        int x = 0;
        int y = 0;
        for (int i = 0;i<moves.length();i++){
            String substring = moves.substring(i, i + 1);
            if(substring.equals("L") || substring.equals("R")){
                x += map.get(substring);
            }else {
                y += map.get(substring);
            }
        }
        return x == 0 && y == 0;
    }

    public static void main(String[] args) {
        String arg = "LURD";
        RobotReturnToOrigin robotReturnToOrigin = new RobotReturnToOrigin();
        boolean b = robotReturnToOrigin.judgeCircle(arg);
        System.out.println(b);
    }
}
