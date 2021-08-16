public class ExcelSheetColumnTitle {
    /*
    * 作者：LeetCode-Solution
      链接：https://leetcode-cn.com/problems/excel-sheet-column-title/solution/excelbiao-lie-ming-cheng-by-leetcode-sol-hgj4/
      来源：力扣（LeetCode）
      著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    * 官方解法一。
    * */
    public String convertToTitle(int columnNumber) {
        StringBuffer result = new StringBuffer();
        while (columnNumber != 0){
            columnNumber--;
            result.append((char) (columnNumber % 26 + 'A'));
            columnNumber /=  26;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        String s = excelSheetColumnTitle.convertToTitle(701);
        System.out.println(s);
    }
}
