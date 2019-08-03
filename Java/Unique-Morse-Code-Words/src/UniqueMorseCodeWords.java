import java.util.HashMap;
import java.util.HashSet;

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<String , String> map = new HashMap<>();
        map.put("a",".-");
        map.put("b","-...");
        map.put("c","-.-.");
        map.put("d","-..");
        map.put("e",".");
        map.put("f","..-.");
        map.put("g","--.");
        map.put("h","....");
        map.put("i","..");
        map.put("j",".---");
        map.put("k","-.-");
        map.put("l",".-..");
        map.put("m","--");
        map.put("n","-.");
        map.put("o","---");
        map.put("p",".--.");
        map.put("q","--.-");
        map.put("r",".-.");
        map.put("s","...");
        map.put("t","-");
        map.put("u","..-");
        map.put("v","...-");
        map.put("w",".--");
        map.put("x","-..-");
        map.put("y","-.--");
        map.put("z","--..");
        HashSet<String> set = new HashSet<>();
        String[] morse = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                String s = words[i].substring(j,j+1);
                String s1 = map.get(s);
                morse[i] = morse[i] + s1;
            }
            set.add(morse[i]);
        }
        return set.size();

        /**
         *官方的方法
         */
        /*String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                "....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();*/
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        String[] s = {"gin","zen","gig","msg"};
        int i = uniqueMorseCodeWords.uniqueMorseRepresentations(s);
        System.out.println(i);
    }
}
