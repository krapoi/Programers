package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class divise {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        if(divisor == 1)
            return arr;

        List<Integer> l = new ArrayList<>();

        for(int i = 0; i < arr.length; i ++){
            if(arr[i] % divisor == 0){
                l.add(arr[i]);
            }
        }
        if(l.size() == 0)
            return new int[] {-1};

        int[] answer = new int[l.size()];
        for(int i = 0; i < l.size(); i ++){
            answer[i] = l.get(i);
        }


        return answer;
    }
}
