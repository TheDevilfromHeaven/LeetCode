public class SumOfAllOddLengthSubarrays {
    /*
    * 作者：crj1998
      链接：https://leetcode-cn.com/problems/sum-of-all-odd-length-subarrays/solution/onshi-jian-fu-za-du-o1shi-jian-fu-za-du-by-crj1998/
      来源：力扣（LeetCode）
    * 很厉害
    * */
//    public int sumOddLengthSubarrays(int[] arr) {
//        int len = arr.length, res = 0;
//        for(int i = 0; i < len; i ++){
//            int LeftOdd = (i+1)/2, LeftEven = i/2+1;
//            int RightOdd = (len-i)/2, RightEven = (len-1-i)/2+1;
//            res += arr[i]*(LeftOdd*RightOdd + LeftEven*RightEven);
//        }
//        return res;
//    }

    public int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int i = 0;
        while (i < arr.length){
            for (int j = 0; j + i < arr.length; j++){
                for (int index = 0 ; index <= i; index++){
                    result += arr[j + index];
                }
            }
            i += 2;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,2,5,3};
        SumOfAllOddLengthSubarrays sumOfAllOddLengthSubarrays = new SumOfAllOddLengthSubarrays();
        int i = sumOfAllOddLengthSubarrays.sumOddLengthSubarrays(arr);
        System.out.println(i);
    }
}
