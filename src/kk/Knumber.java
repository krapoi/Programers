package kk;

import java.util.Arrays;

public class Knumber {


    public int[] solution(int[] array, int[][] commands) {
        int length = commands.length;
        int[] answer = new int[length];
        for(int l = 0; l <length; l++){
            int firstcut = commands[l][0];
            int lastcut = commands[l][1];
            int number = commands[l][2];
            int[] temp;
            temp = Arrays.copyOfRange(array, firstcut-1, lastcut);
            for(int j = 0; j < temp.length; j++)
                System.out.println(temp[j]);
            Arrays.sort(temp);

            answer[l] = temp[number-1];
            System.out.println("answer : " + answer[l]);
        }


        return answer;
    }

    public static void main(String[] args) {
        Knumber k = new Knumber();
        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] com = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        System.out.println(k.solution(arr,com));

        // 정답[6,6,3]

    }
}
