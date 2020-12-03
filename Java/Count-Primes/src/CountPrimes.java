import java.util.Arrays;

public class CountPrimes {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/count-primes/solution/ji-shu-zhi-shu-by-leetcode-solution/
      来源：力扣（LeetCode）
    * 官方解法二。暴力会超时，看看其他人带图的解答，一看就明白。
    * */
    public int countPrimes(int n) {
        int[] isPrime = new int[n];
        Arrays.fill(isPrime,1);
        int res = 0;
        for (int i = 2; i < n; i++){
            if (isPrime[i] == 1){
                res++;
                if ((long) i * i < n){
                    for (int j = i * i; j < n; j += i){
                        isPrime[j] = 0;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        int i = countPrimes.countPrimes(10);
        System.out.println(i);
    }
}
