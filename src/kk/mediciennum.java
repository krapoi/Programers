package programers;

public class mediciennum {
    public int solution(int left, int right) {
        int answer = 0;
        int n1;
        for(int i = 0; i < right - left; i++) {
            n1 = num(left + i);
            if (n1 % 2 == 0) {
                answer += left + i;
            } else if (n1 % 2 == 1) {
                answer -= left + 1;
            }
            System.out.println(answer);
            System.out.println(left + i);
        }
        return answer;
        }


    public int num(int n){
        int result = 0;
        for(int i = 1; i < n; i++){
            if(n % i == 0){
                result++;
            }
        }
        return result;
    }

}
