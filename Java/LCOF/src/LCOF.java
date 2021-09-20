public class LCOF {
    public int fib(int n) {
        final int MOD = 1000000007;
        if (n < 2) return n;
        int p = 0;
        int q = 1;
        int result;
        for(int i = 2; i <= n; i++){
            result = p + q;
            p = q;
            q = result % MOD;
        }
        return q;
    }

    public static void main(String[] args) {
        int fib = new LCOF().fib(45);
        System.out.println(fib);
    }
}
