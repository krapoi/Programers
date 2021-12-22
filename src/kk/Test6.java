package Coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test6 {

    /*
Hello    <---입력
Hello
World    <---입력
W
o
r
l
d
20 30     <---입력
20 + 30 = 50
*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        System.out.println(a);

        char[] ch = br.readLine().toCharArray();
        for(char c:ch){
            System.out.println(c);
        }

        String[] c = (br.readLine()).split(" ");
        int sum;
        sum = Integer.parseInt(c[0]) + Integer.parseInt(c[1]);
        System.out.println(Integer.parseInt(c[0]) + " + " + Integer.parseInt(c[1]) + " = " + sum);



    }
}
