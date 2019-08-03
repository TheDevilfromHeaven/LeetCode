public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        /*
        * 不会，查看官方的方法一：水平扫描法
        * 官方把第一个字符串赋值给prefix
        * 循环字符串组逐个比较，通过indexOf（返回指定字符在字符串中第一次出现处的索引，返回0是确保从第一个字符开始，不存在就返回-1）方法判断是否存在，然后减少prefix的长度
        * 当一直不存在就会出现prefix被赋值为“”的情况，这时用isEmpty方法判断，返回return “”
        * */
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i = 1;i<strs.length;i++){
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0,(prefix.length()-1));
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        String result = longestCommonPrefix.longestCommonPrefix(strs);
        System.out.println(result);
    }
}
