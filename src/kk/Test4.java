package Coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4 {


    public static void main(String[] args) {
//        InputStreamReader isr = new InputStreamReader(System.in);
//        BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = new String();
        int age = 0;
        float tall = 0f;
        double weight = 0d;
        char gender = 1;

        System.out.print("이름 : ");
        try {
            name=br.readLine();
            System.out.print("나이 : ");
            age=Integer.parseInt(br.readLine());
            System.out.print("신장 : ");
            tall=Float.parseFloat(br.readLine());
            System.out.print("체중 : ");
            weight=Double.parseDouble(br.readLine());
            System.out.print("성별 : ");
            gender=br.readLine().charAt(0);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("나의 이름은 " + name + "입니다.");
        System.out.println("나의 나이는 " + age + "입니다.");
        System.out.println("나의 키는 " + tall + "입니다.");
        System.out.println("나의 몸무게는 " + weight + "입니다.");
        System.out.println("나의 성별은 " + gender + "입니다.");

    }


}
