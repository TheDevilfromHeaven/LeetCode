public class NumberOfStudentsDoingHomeworkAtAGivenTime {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int result = 0;
        for (int i = 0; i < startTime.length; i++){
            if (startTime[i] <= queryTime && queryTime <= endTime[i]){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] startTime = {1,2,3};
        int[] endTime = {3,2,7};
        NumberOfStudentsDoingHomeworkAtAGivenTime numberOfStudentsDoingHomeworkAtAGivenTime = new NumberOfStudentsDoingHomeworkAtAGivenTime();
        int i = numberOfStudentsDoingHomeworkAtAGivenTime.busyStudent(startTime, endTime, 4);
        System.out.println(i);
    }
}
