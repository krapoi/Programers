package programers;

import java.util.Arrays;

public class Ponketmon {

    public static void main(String[] args) {
        Ponketmon l = new Ponketmon();
        int[] num = {3,3,3,2,2,2};
        l.solution(num);
    }

    public int solution(int[] nums) {
        int[] answer = new int[nums.length / 2];
        answer[0] = 0;
        int n = 0;
        Arrays.sort(nums);
        for(int i = 0; i <nums.length - 1; i++){
            if(nums[i] != answer[n]){
                answer[n] = nums[i];
                System.out.println(answer[n]);
                System.out.println(n);

                if(answer.length == nums.length / 2)
                    break;
                n++;

            }
        }

        System.out.println(answer.length);
        return answer.length;
    }
}
