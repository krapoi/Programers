package programers;

public class averagenum {
    public double solution(int[] arr) {
        double answer = 0;
        for (int j : arr) {
            answer += j;
        }
        return answer / arr.length;
    }


}
