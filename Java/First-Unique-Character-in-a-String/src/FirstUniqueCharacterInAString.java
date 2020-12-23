public class FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++){
            chars[s.charAt(i) - 'a']++;
        }
        for (int j = 0;j < s.length(); j++){
            if (chars[s.charAt(j) - 'a'] == 1){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacterInAString firstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
        int i = firstUniqueCharacterInAString.firstUniqChar("loveleetcode");
        System.out.println(i);
    }
}
