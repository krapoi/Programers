package Coding;

import java.util.Scanner;

public class Test3 {
/* [문제] 2개의 숫자중 큰수를 출력하시오
5
3 7
5 4
9 10
2 -1
8 6

#1 7
#2 5
#3 10
#4 2
#5 8
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();
        int[] result = new int[cnt];
        int[] intdata = new int[2];

        for(int i = 0; i < cnt; i++){
            String[] data = sc.nextLine().split(" ");

            for(int j = 0; j < data.length; j++){
                intdata[j] = Integer.parseInt(data[j]);
            }

            if(intdata[0] > intdata[1]){
                result[i] = intdata[0];
            }else
                result[i] = intdata[1];
        }

        for(int i = 0; i < result.length; i++)
            System.out.println("#" + (i+1) + " " + result[i]);

    }
}
