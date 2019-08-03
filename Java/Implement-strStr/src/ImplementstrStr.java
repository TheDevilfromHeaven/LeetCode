import java.util.HashMap;

public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        /*
        *不是最优的方案，有待提高。
        * */
        if (needle.length() == 0) return 0;
        if(haystack.length() == 0) return -1;
        HashMap<Object, Object> map = new HashMap<>();
        map.put(needle,needle);
        for (int i = 0; i < haystack.length(); i++) {
            if (i+needle.length()>haystack.length()) {
                return -1;
            }else if (map.containsKey(haystack.substring(i, i + needle.length()))) {
                return i;
            }
        }
        return -1;

        /*
        * 下面是别人的方法，他的比我的跟简便，代码量也更少，思路大致相似。
        * */
        /*if(needle.length() == 0)
            return 0;
        if(haystack.length() == 0)
            return -1;
        for(int i=0;i<=haystack.length()-needle.length();i++)
            if(needle.equals(haystack.substring(i,i+needle.length())))
                return i;
        return -1;*/
    }

    public static void main(String[] args) {
        ImplementstrStr implementstrStr = new ImplementstrStr();
        int i = implementstrStr.strStr("", "");
        System.out.println(i);
    }
}
