package programers;

import java.util.Arrays;

public class PlusNonNum {
    public int solution(int[] numbers) {
        int answer = 0;

        for(int i = 0; i <=9; i++){
        boolean isinclude = contains(numbers,i);
            if(!isinclude){
                answer += i;
                System.out.println(answer);
            }
        }

        return answer;
    }
    public static boolean contains(final int[] arr, final int key) {
        return Arrays.stream(arr).anyMatch(i -> i == key);
    }
    public static void main(String[] args) {
        PlusNonNum n = new PlusNonNum();
        int[] s = {1,2,3,4,6,7,8,0};
        System.out.println(n.solution(s));
    }
}
