package programers;

import java.util.Arrays;


public class ReversSort {

    public long solution(long n) {
        String sn = Long.toString(n);
        char[] c = sn.toCharArray();
        Arrays.sort(c);
        String s = new String(c);
        StringBuilder sb = new StringBuilder(s);
        String string = sb.reverse().toString();
        return Long.valueOf(string).longValue();
    }
}
