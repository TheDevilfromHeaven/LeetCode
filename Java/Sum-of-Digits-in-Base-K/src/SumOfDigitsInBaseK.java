public class SumOfDigitsInBaseK {
    public int sumBase(int n, int k) {
        int result = 0;
        while (n >= k){
            result += n % k;
            n = n / k;
        }
        return result + n;
    }

    public static void main(String[] args) {
        SumOfDigitsInBaseK sumOfDigitsInBaseK = new SumOfDigitsInBaseK();
        int i = sumOfDigitsInBaseK.sumBase(34, 6);
        System.out.println(i);
    }
}
