package programers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversArray {

    public int[] solution(long n) {
        int k = 0;
        List<Integer> list = new ArrayList<>();
        while(n > 0){
            k = (int) (n % 10);
            list.add(k);
            n/=10;
        }
        System.out.println(list);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
            System.out.println(answer[i]);
        }


        return answer;
    }

    public static void main(String[] args) {
        ReversArray r = new ReversArray();
        System.out.println(Arrays.toString(r.solution(12345)));
    }


}
