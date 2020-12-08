public class SubtractTheProductAndSumOfDigitsOfAnInteger {
    public int subtractProductAndSum(int n) {
        int multiply = 1;
        int sum = 0;
        while (n > 0){
            int j = n % 10;
            sum += j;
            multiply *= j;
            n = n  / 10;
        }
        return (multiply - sum);
    }

    public static void main(String[] args) {
        SubtractTheProductAndSumOfDigitsOfAnInteger subtractTheProductAndSumOfDigitsOfAnInteger = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        int i = subtractTheProductAndSumOfDigitsOfAnInteger.subtractProductAndSum(234);
        System.out.println(i);
    }
}
