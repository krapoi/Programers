package programers;

public class MinMaxCommonMultiple {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = Multiple(n,m);
        answer[1] = Min(n,m);

        return answer;
    }

    public static int Multiple(int num1, int num2){
        if(num2 == 0) return num1;
        else return Multiple(num2,num1 % num2);
    }

    public int Min(int n1, int n2){
        return n1 * n2 / Multiple(n1,n2);
    }
}
