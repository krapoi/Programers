package Coding;

import java.util.Scanner;

public class Test15 {
    /*[문제] 2자리의 난수를 발생하여 발생된 숫자를 맞추는 게임 프로그램
           (두자리의 난수: 10 - 99, Math클래스 사용)

    [출력]
    83  <---컴퓨터가 만든 수(화면에는 보이지 않아야 함)
    *** 숫자 맞추기 게임을 시작합니다 ***
    숫자 입력: 50
    컴퓨터의 숫자가 더 큽니다.

    숫자 입력: 90
    컴퓨터의 숫자가 더 작습니다.
          :

    숫자 입력: 83
    축하합니다.3번만에 맞추셨습니다.

    한번 더 할까요(Y/y): n
    **수고 하셨습니다 **
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            int cnum = (int) (Math.random() * 90 + 10);
            int cnt = 0;
            System.out.println("*** 숫자 맞추기 게임을 시작합니다 ***");
                do {
                    cnt++;
                    System.out.print("숫자 입력: ");

                    int pnum = sc.nextInt();

                    if(pnum < cnum)
                        System.out.println("컴퓨터의 숫자가 더 큽니다.");
                    else if(pnum > cnum)
                        System.out.println("컴퓨터의 숫자가 더 작습니다.");
                    else {
                        System.out.println("축하합니다." + cnt + "번만에 맞추셨습니다.");
                        sc.nextLine();
                        cnt = 0;
                        break;
                    }

                    System.out.println();

                }while(true);

            System.out.print("한번 더 하시겠습니까? (Y/y)");

            char continued = sc.nextLine().charAt(0);

            if(continued == 'Y' || continued == 'y')
                System.out.println();
            else{
                System.out.println("**수고 하셨습니다.**");
                break;
            }

        }while (true);
    }
}
