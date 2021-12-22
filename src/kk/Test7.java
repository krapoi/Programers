package Coding;

import java.util.Scanner;

public class Test7 {

//    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        sb.append("Hello ");
//        sb.append("World").append("!!!");
//        System.out.println(sb.toString());
//
//        sb.setLength((sb.length()-3));
//        System.out.println(sb.toString());
//        sb.insert(0,"aaa");
//        System.out.println(sb);
//        sb.reverse();
//        System.out.println(sb);
//    }

    public static void main(String args[]) throws Exception
{
    Scanner sc = new Scanner(System.in);
    int T;
    int sum = 0;
    T=sc.nextInt();
    sc.nextLine();
    for(int test_case = 1; test_case <= T; test_case++)
    {
        String[] data = sc.nextLine().split(" ");
        for(int i = 0; i < data.length; i++){
            int a = Integer.parseInt(data[i]);
            if(a % 2 == 1)
                sum += a;
        }
        System.out.println("#" + (test_case) + " " + sum);
        sum = 0;
    }
}
}
