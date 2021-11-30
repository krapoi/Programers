package programers;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Strangesort {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String r = br.readLine();

        int[] arr = Arrays.stream(r.substring(0, r.length()).split(" "))
                .map(String::trim).mapToInt(Integer::parseInt).toArray();

        List<Integer> miner = new ArrayList<>();
        List<Integer> plus = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                miner.add(arr[i]);
            }else
                plus.add(arr[i]);
        }

        List<Integer> result = new ArrayList<>();
        result.addAll(miner);
        result.addAll(plus);

        String last = Arrays.toString(result.toArray()).replace("[", "").replace("]", "").replace(",", "");
        System.out.println(last);

    }
}
