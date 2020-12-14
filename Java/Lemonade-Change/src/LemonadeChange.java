public class LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int[] money = new int[2];
        for (int i = 0; i < bills.length; i++){
            switch (bills[i] - 5){
                case 0:
                    money[0]++;
                    break;
                case 5:
                    money[1]++;
                    if (money[0] == 0){
                        return false;
                    }else {
                        money[0]--;
                    }
                    break;
                case 15:
                    if (money[0] > 0 && money[1] > 0){
                        money[0]--;
                        money[1]--;
                    }else if (money[0] > 3){
                        money[0] -= 3;
                    }else {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] bills = {5,5,10,10,20};
        LemonadeChange lemonadeChange = new LemonadeChange();
        boolean b = lemonadeChange.lemonadeChange(bills);
        System.out.println(b);
    }
}
