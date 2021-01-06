public class FibonacciNumber {
    public int fib(int n) {
        if (n < 2) return n;
        int n1 = 0;
        int n2 = 1;
        int result = 0;
        for (int i = 2; i <= n; i++){
            result = n1 + n2;
            n1 = n2;
            n2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        int fib = fibonacciNumber.fib(3);
        System.out.println(fib);
    }
}
