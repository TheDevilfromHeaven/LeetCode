public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int A = 0;
        int L = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('A' == s.charAt(i)){
                A++;
                if (A >= 2) return false;
            }
            if ('L' == s.charAt(i)){
                L++;
                if (L >= 3) return false;
            }else{
                L = 0;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean ppalll = new StudentAttendanceRecordI().checkRecord("PPALLL");
        System.out.println(ppalll);
    }
}
