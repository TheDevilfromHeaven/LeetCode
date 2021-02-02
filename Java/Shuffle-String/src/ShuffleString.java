public class ShuffleString {
    //111
    public String restoreString(String s, int[] indices) {
        char[] result = new char[indices.length];
        for (int i = 0; i < indices.length; i++){
            result[indices[i]] = s.charAt(i);
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        String s = "art";
        int[] indices = {1,0,2};
        ShuffleString shuffleString = new ShuffleString();
        String s1 = shuffleString.restoreString(s, indices);
        System.out.println(s1);
    }
}
