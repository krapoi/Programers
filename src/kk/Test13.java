package Coding;

import java.util.Scanner;

public class Test13 {
    /*[문제]년도를 입력받아 윤년/평년 구하기(Scanner를 이용)
    공식)
   ① 년도를 4로 나누어 떨어져야 하고,년도를 100으로 나누어 떨어지지 않아야함
   ② 또는 년도를 400으로 나누어 떨어져야 함
   ③ 예시) 4(윤년), 100(평년), 400(윤년)

[입력]
6
4 100 400 2000 2001 2004

[출력]
#1 윤년
#2 평년
#3 윤년
#4 윤년
#5 평년
#6 윤년
*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        sc.nextLine();

        String[] num = sc.nextLine().split(" ");
        for(int j = 0; j < num.length; j++){
            if(Integer.parseInt(num[j]) % 4 == 0 && Integer.parseInt(num[j]) % 100 != 0 || Integer.parseInt(num[j]) % 400 == 0)
                System.out.println("#" + (j+1) + " 윤년");
            else System.out.println("#" + (j+1) + " 평년");

        }
    }
}
