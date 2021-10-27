package programers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IhateSameNum {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){

            if( i >= 1 && arr[i] != arr[i - 1])
                list.add(arr[i]);
            else if(i == 0)
                list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        IhateSameNum s = new IhateSameNum();
        int[] arr = {1,1,3,3,0,1,1};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}
