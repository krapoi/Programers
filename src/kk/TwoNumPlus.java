package programers;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class TwoNumPlus {
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {5,0,2,7};
        TwoNumPlus t = new TwoNumPlus();

        System.out.println(Arrays.toString(t.solution(arr)));
    }
}
