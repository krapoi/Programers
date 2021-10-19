package programers;


import java.util.Arrays;
import java.util.Collections;

public class StringReversSort {
    public String solution(String s) {

        char[] string = s.toCharArray();
        Arrays.sort(string);
        return new StringBuilder(new String(string)).reverse().toString();
    }
}
