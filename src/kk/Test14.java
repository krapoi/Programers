package Coding;

public class Test14 {
    /*[문제] 50개의 난수를 만들어서 다음과 같이 출력하시오(Math를 이용)
           조건1) 0 - 100 사이의 수 일것 (힌트: gab+1,시작값)
           조건2) 1줄에 6개씩 표시하시오

    [출력]
    12      72      74      0       20      89
    84      83      53      0       95      53
    68      55      89      6       20      68
    17      9       75      56      17      85
    62      33      7       34      85      28
    28      55      95      31      69      22
    30      92      1       16      88      80
    64      55      71      12      29      72
    20      41
    합=2420
    */
    public static void main(String[] args) {
        int result = 0;
        int[] arr = new int[50];
        for(int i = 0; i < 50; i++){
            int a = (int)(Math.random() * 101);
            result += a;
            arr[i] = a;

        }
        int cnt = -1;
        for(int i = 0; i < 50; i++){
            cnt++;
            if(cnt == 6){
                System.out.println();
                cnt = 0;
            }
            System.out.print(arr[i] + "      ");
        }
        System.out.println();
        System.out.println("합="+result);
    }
}
