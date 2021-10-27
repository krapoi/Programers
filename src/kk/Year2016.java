package programers;

public class Year2016 {
    public String solution(int a, int b) {
        //SUN,MON,TUE,WED,THU,FRI,SAT

        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        int select = 0;

        for(int i = 0; i < a-1; i++){
            select += date[i];
        }
        select += b - 1;

        return day[select % 7];
    }
}
