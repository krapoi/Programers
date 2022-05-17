package Coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test5 {

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//        String s = "학교#학원,도서관/게임방 노래방 영화관";
//        StringTokenizer st = new StringTokenizer(s,"#,/ ");
//        //System.out.println(st.countTokens());
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }
//
//    }
// split: 구분자를 1개만 사용할수 있다.
// StringTokenizer: 구분자를 여러개 사용할수 있다.



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
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[] result = new int[cnt];

        for(int i = 0; i < cnt; i++){
            String d = br.readLine().replaceAll(" ","");
            char[] datas = d.toCharArray();

            for(int j = 0; j < datas.length; j++){
                result[i] += datas[j] - '0';
            }

            System.out.println("#" + (i+1) + " " + result[i]);
        }
    }
}
