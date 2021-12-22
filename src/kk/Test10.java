package Coding;

public class Test10 {

    public static void main(String[] args) {
        //System.out.println(Math.random());                 // 0 ~ 0.9999999
        //System.out.println((int)(Math.random() * 10 + 1)); // 1 ~ 10, (gab+1, 시작값)
        //  0 ~ 0.9999999
        //  0 ~ 9.9999999
        //  1 ~ 10.999999
        //  1 ~ 10
        //System.out.println((int)(Math.random() * 21 + 50)); // 50 ~ 70
        //  0 ~ 0.999999
        //  0 ~ 20.99999
        // 50 ~ 70.99999
        // 50 ~ 70
        //System.out.println((int)(Math.random() * 20 + 51)); // 51 ~ 70

        int cnt = 0;
        do {
            cnt++;
            System.out.println((int)(Math.random() * 26 + 65));
        }while (cnt<10);

    }
}
