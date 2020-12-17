import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        if (pattern.length() != s1.length) return false;
        Map map = new HashMap<>();
        for (Integer i = 0; i < pattern.length(); i++){
            if (map.put(pattern.charAt(i),i) != map.put(s1[i],i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        WordPattern wordPattern = new WordPattern();
        boolean b = wordPattern.wordPattern(pattern, s);
        System.out.println(b);
    }
}
