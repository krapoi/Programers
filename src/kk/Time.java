package programers;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Time {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int n = Integer.parseInt(input);

        if(n == 3){
            System.out.println((n+1) * 1920 + 3600);
            return;
        }

        System.out.println((n + 1) * 1920);
    }
}
