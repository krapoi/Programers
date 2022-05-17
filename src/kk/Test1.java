package Coding;

import java.util.Scanner;

public class Test1 {
    // Scanner를 이용한 입력받기
/*
[입력]
3
3 4 5 1 3 4 5 1 4 5
6 7 8 5 4 2 1 5 6 7
4 5 6 7 2 5 7 6 1 1

[출력]
#1 35
#2 51
#3 44
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();    // 3
        sc.nextLine();

        int[] sum = new int[cnt];
        for(int i = 0; i < cnt; i++){
            String[] datas = sc.nextLine().split(" ");

            for(int j = 0; j < datas.length; j++){
                sum[i] += Integer.parseInt(datas[j]);
            }
        }

        for(int i = 0; i < cnt; i++){
            System.out.println("#" + (i+1) + " " + sum[i]);
        }
    }
}
