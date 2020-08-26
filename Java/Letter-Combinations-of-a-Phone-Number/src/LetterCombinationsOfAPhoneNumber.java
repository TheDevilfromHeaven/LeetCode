import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsOfAPhoneNumber {
    /*
    * 一个字难，用的是官方解法,详细解释请移步官方解释页。
    * */
    public List<String> letterCombinations(String digits) {
        ArrayList<String> combinations = new ArrayList<>();
        if (digits.length() == 0) {
            return combinations;
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        run(combinations,digits, 0,new StringBuffer(),map);
        return combinations;
    }

    public void run(List<String> combinations,String arg,int index,StringBuffer s,HashMap<Character, String> map){
        if(index == arg.length()){
            combinations.add(s.toString());
        }else {
            char digit = arg.charAt(index);
            String letters = map.get(digit);
            for (int i = 0;i<letters.length();i++){
                s.append(letters.charAt(i));
                run(combinations,arg,index + 1,s,map);
                s.deleteCharAt(index);
            }
        }
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new LetterCombinationsOfAPhoneNumber();
        List<String> strings = letterCombinationsOfAPhoneNumber.letterCombinations("");
        System.out.println(strings);
    }
}
