package kk;

public class queue {

    public int solution(int[] nums) {
        int answer = 0;
        int sum = 0;
        for(int i = 0; i< nums.length - 2; i++){
            for(int j = i +1; j< i + 2; j++){
                sum += nums[j];
            }

            for (int k=2; k*k<=sum; ++k){

                if (sum%k == 0)
                    break;
                answer++;
            }
            sum = 0;
        }
        System.out.println(answer);
        return answer;
    }

}
