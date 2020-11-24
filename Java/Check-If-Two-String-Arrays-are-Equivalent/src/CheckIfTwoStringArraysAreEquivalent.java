public class CheckIfTwoStringArraysAreEquivalent {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer1 = new StringBuffer();
        for (int i = 0; i < word1.length; i++){
            stringBuffer.append(word1[i]);
        }
        for (int j = 0; j < word2.length; j++){
            stringBuffer1.append(word2[j]);
        }
        return stringBuffer.toString().equals(stringBuffer1.toString());
    }

    public static void main(String[] args) {
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        CheckIfTwoStringArraysAreEquivalent checkIfTwoStringArraysAreEquivalent = new CheckIfTwoStringArraysAreEquivalent();
        boolean b = checkIfTwoStringArraysAreEquivalent.arrayStringsAreEqual(word1, word2);
        System.out.println(b);
    }
}
