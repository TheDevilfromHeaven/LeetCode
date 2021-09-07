public class LatestTimeByReplacingHiddenDigits {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/latest-time-by-replacing-hidden-digits/solution/ti-huan-yin-cang-shu-zi-de-dao-de-zui-wa-0s7r/
      来源：力扣（LeetCode）
    * 官方解法一
    * */
    public String maximumTime(String time) {
        char[] arr = time.toCharArray();
        if (arr[0] == '?'){
            arr[0] = (arr[1] >= '4' && arr[1] <= '9') ? '1' : '2';
        }
        if (arr[1] == '?'){
            arr[1] = (arr[0] == '2') ? '3' : '9';
        }
        if (arr[3] == '?'){
            arr[3] = '5';
        }
        if (arr[4] == '?'){
            arr[4] = '9';
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = new LatestTimeByReplacingHiddenDigits().maximumTime("1?:??");
        System.out.println(s);
    }
}
