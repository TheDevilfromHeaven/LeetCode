public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        String str = "aeiouAEIOU";
        int l = 0;
        int r = s.length() - 1;
        char[] chars = s.toCharArray();
        char tmp;
        while (l < r){
            if (str.indexOf(chars[l]) == -1){
                l++;
            }else if (str.indexOf(chars[r]) == -1){
                r--;
            }else{
                tmp = chars[l];
                chars[l] = chars[r];
                chars[r] = tmp;
                l++;
                r--;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s = new ReverseVowelsOfAString().reverseVowels("leetcode");
        System.out.println(s);
    }
}
