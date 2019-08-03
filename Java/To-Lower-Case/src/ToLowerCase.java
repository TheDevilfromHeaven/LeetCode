public class ToLowerCase {
    public String toLowerCase(String str) {
        /*
        * 根据ASCII码进行转换
        * */
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 65 && c <= 90) {
                c += 32;
                stringBuilder.append(c);
            } else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();

        /*
        * java提供了方法转小写toLowerCase()和转大写toUpperCase()
        * */
        /*return str.toLowerCase();*/
    }

    public static void main(String[] args) {
        ToLowerCase toLowerCase = new ToLowerCase();
        String hello = toLowerCase.toLowerCase("Hello");
        System.out.println(hello);
    }
}
