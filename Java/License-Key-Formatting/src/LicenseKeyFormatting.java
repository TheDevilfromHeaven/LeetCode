public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuffer stringBuffer = new StringBuffer();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-'){
                stringBuffer.append(Character.toUpperCase(c));
                count++;
                if (count == k){
                    stringBuffer.append("-");
                    count = 0;
                }
            }
        }
        if (stringBuffer.length() > 0 && stringBuffer.charAt(stringBuffer.length() - 1) == '-') stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        return stringBuffer.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        String s1 = new LicenseKeyFormatting().licenseKeyFormatting(s, 4);
        System.out.println(s1);
    }
}
