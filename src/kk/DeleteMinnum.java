package programers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteMinnum {
    public int[] solution(int[] arr) {
        int min = arr[0];
        int index = 0;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            list.add(i,arr[i]);
            if(arr.length <= 1){
                return new int[]{-1};
            }

            if(arr[i] < min){
                min = arr[i];
                index = i;
                System.out.println(index);
            }

        }
        list.remove((Integer) min);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i ++){
            answer[i] = list.get(i);
        }
        return answer;

    }

    public static void main(String[] args) {
        DeleteMinnum d = new DeleteMinnum();
        int[] arr = {10};
        System.out.println(Arrays.toString(d.solution(arr)));
    }
}
