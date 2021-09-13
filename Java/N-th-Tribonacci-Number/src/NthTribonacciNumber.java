public class NthTribonacciNumber {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/n-th-tribonacci-number/solution/di-n-ge-tai-bo-na-qi-shu-by-leetcode-sol-kn16/
      来源：力扣（LeetCode）
    * 官方解法一。
    * */
//    public int tribonacci(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n <= 2) {
//            return 1;
//        }
//        int p = 0, q = 0, r = 1, s = 1;
//        for (int i = 3; i <= n; ++i) {
//            p = q;
//            q = r;
//            r = s;
//            s = p + q + r;
//        }
//        return s;
//    }

    public int tribonacci(int n) {
        if (n < 3){
            if (n == 0){
                return 0;
            }else {
                return 1;
            }
        }
        int[] ints = new int[n+1];
        ints[0] = 0;
        ints[1] = 1;
        ints[2] = 1;
        for (int i = 3; i <= n; i++){
            ints[i] = ints[i-1] + ints[i-2] + ints[i-3];
        }
        return ints[n];
    }

    public static void main(String[] args) {
        int tribonacci = new NthTribonacciNumber().tribonacci(25);
        System.out.println(tribonacci);
    }
}
