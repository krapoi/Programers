package programers;

public class xton {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long plus = x;
        for(int i = 0; i<n;i++){
            answer[i] = x;
            x += plus;
        }
        return answer;
    }
}
