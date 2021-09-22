public class LengthOfLastWord {
    /*
    * 看到一个非常棒的方法。
    * */
//    public int lengthOfLastWord(String s) {
//        s = s.trim();
//        return s.length() - s.lastIndexOf(" ") - 1;
//    }

    public int lengthOfLastWord(String s) {
        int len = s.length() - 1;
        int start = 0;
        int end = 0;
        for (int i = len; i >= 0 && end == 0; i--) {
            if (s.charAt(i) != ' '){
                if (start == 0){
                    start = i + 1;
                }
            }else {
                if (start != 0){
                    end = i + 1;
                }
            }
        }
        return start - end;
    }

    public static void main(String[] args) {
        int n = new LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  ");
        System.out.println(n);
    }
}
