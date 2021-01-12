public class NumberOfStepsToReduceANumberToZero {
    public int numberOfSteps (int num) {
        int result = 0;
        while (num != 0){
            if (num % 2 == 1){
                num--;
            }else {
                num = num / 2;
            }
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        NumberOfStepsToReduceANumberToZero numberOfStepsToReduceANumberToZero = new NumberOfStepsToReduceANumberToZero();
        int i = numberOfStepsToReduceANumberToZero.numberOfSteps(123);
        System.out.println(i);
    }
}
