public class GuessNumberHigherOrLower {
    public int guess(int num){
        int pick = 2;
        if (num < pick){
            return 1;
        }else if(num > pick){
            return -1;
        }
        return 0;
    }

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        int result = 0;
        while (guess(result) != 0){
            result = left + (right - left) / 2;
            if (guess(result) == 1){
                left = result + 1;
            }else if (guess(result) == -1){
                right = result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 2;
        GuessNumberHigherOrLower guessNumberHigherOrLower = new GuessNumberHigherOrLower();
        int i = guessNumberHigherOrLower.guessNumber(n);
        System.out.println(i);
    }
}
