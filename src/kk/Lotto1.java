package Coding;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

public class Lotto1 {
/*[문제]아래 결과와 같이 행운의 로또번호 생성기를 만들려고 한다
1. 서로 겹치지 않는 (중복되지 않는) 숫자 6개 생성
2. 각 숫자는 1~45 범위내의 숫자
3. 매번 실행시 다른 숫자 출력
   ---> 랜덤수 : Math사용
4. 오름차순 정렬

[결과]
            9 11 16 20 21 40
            */

    public static void main(String[] args) {
        Integer[] arr = new Integer[6];
        arr[0] = (int) (Math.random() * 45 + 1);;
        for(int i = 1; i < 6; i++){
            int a = (int) (Math.random() * 45 + 1);
            arr[i] = a;

            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    i--;
                    break;
                }
            }

        }
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr).replaceAll("]","").replace('[',' ').replaceAll(" ","").replaceAll(","," "));
    }
}
