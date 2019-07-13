public class DefangingAnIpAddress {
    public String defangIPaddr(String address) {
//        看到最简单的解法
//        return address.replace(".", "[.]");

        /*
        * 我的解法就是遍历address，把点改为[.]，然后组合为新的字符串。
        * */
        String result = "";
        for (int i = 0; i < address.length(); i++) {
            String ch = address.substring(i, (i + 1));
            if ( ch.equals(".")){
                ch = "[.]";
                result += ch;
            }else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DefangingAnIpAddress defangingAnIpAddress = new DefangingAnIpAddress();
        String result = defangingAnIpAddress.defangIPaddr("255.100.50.0");
        System.out.println(result);
    }
}
