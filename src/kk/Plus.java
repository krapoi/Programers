package programers;

public class Plus {
    public long solution(int a, int b) {
        long answer = 0;
        long length = a > b ? a - b : b - a;
        for(int i = 0; i < length; i++){
            answer += a > b ? b+i : a+i;
        }
        return answer;
    }
}
