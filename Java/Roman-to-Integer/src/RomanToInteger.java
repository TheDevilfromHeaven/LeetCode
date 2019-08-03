import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        /*
        * 参考了其他人的方法
        * 使用HashMap集合创建罗马数对应的整数
        * */
        Map<String,Integer> map = new HashMap<>();
        map.put("I",1);
        map.put("IV",4);
        map.put("V",5);
        map.put("IX",9);
        map.put("X",10);
        map.put("XL",40);
        map.put("L",50);
        map.put("XC",90);
        map.put("C",100);
        map.put("CD",400);
        map.put("D",500);
        map.put("CM",900);
        map.put("M",1000);

        int result = 0;
       /* for循环遍历字符串
        * 每次取出字符串的两个字符与map里的key进行比较，符合就get map里的数加到result里，不符合或只剩一个字符时就执行else
        * else把map里符合的单个字符的数加到result里
        * */
        for (int i =  0; i < s.length(); ) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                result += map.get(s.substring(i,i+2));
                i += 2;
            }else {
                result += map.get(s.substring(i,i+1));
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInteger = new RomanToInteger();
        int result = romanToInteger.romanToInt("MCMXCIV");
        System.out.println(result);
    }
}
