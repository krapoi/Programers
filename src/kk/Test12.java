package Coding;

public class Test12 {
    /*
    [문제] 다중for문을 이용해서 소수를 구하시오
1-50사이의 소수 (1과 자기자신 이외의 약수를 갖지 않는 수)

            [출력]
            2 3 5 7 11 .....47
    갯수: 15
            */
    static int a = 0;
    public static void main(String[] args) {

        for(int i = 1; i <= 50; i++){
            prime(i);
        }
        System.out.println();
        System.out.println("갯수 : " + a);
    }

    public static void prime(int number) {
        if(number < 2) {
            return;
        }
        if(number == 2) {
            a++;
            System.out.print(number + " ");
            return;
        }
        for(int i = 2; i < number; i++) {
            if(number % i == 0) {
                return;
            }
        }
        a++;
        System.out.print(number + " ");
        return;
    }



//    public static void main(String[] args) {
//        for(int i = 5; i >= 1; i--){
//            for(int j = i; j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
}
