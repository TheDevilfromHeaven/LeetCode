public class ExcelSheetColumnNumber {
    /*
    * 作者：guanpengchn
      链接：https://leetcode-cn.com/problems/excel-sheet-column-number/solution/hua-jie-suan-fa-171-excelbiao-lie-xu-hao-by-guanpe/
      来源：力扣（LeetCode）
    * 很棒的思路
    * */
//    public int titleToNumber(String s) {
//        int ans = 0;
//        for(int i=0;i<s.length();i++) {
//            int num = s.charAt(i) - 'A' + 1;
//            ans = ans * 26 + num;
//        }
//        return ans;
//    }

    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/excel-sheet-column-number/solution/excelbiao-lie-xu-hao-by-leetcode-solutio-r29l/
      来源：力扣（LeetCode）
    * 官方解法一
    * */
    public int titleToNumber(String columnTitle) {
        int number = 0;
        int multiple = 1;
        for (int i = columnTitle.length() - 1; i >= 0; i--){
            int k = columnTitle.charAt(i) - 'A' + 1;
            number += k * multiple;
            multiple *= 26;
        }
        return number;
    }

    public static void main(String[] args) {
        String columnTitle = "ZY";
        int i = new ExcelSheetColumnNumber().titleToNumber(columnTitle);
        System.out.println(i);
    }
}
